package communication;

import auxiliary.ConnectionNode;
import auxiliary.CryptoSystemFactory;
import communication.exceptions.PublicKeyNotFoundException;
import ntru.PublicKeyCryptoSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component
public class Messenger {
    @Autowired
    private CryptoSystemFactory cryptoSystemFactory;
    @Autowired
    private ConnectionManager connectionManager;
    private PublicKeyCryptoSystem publicKeyCryptoSystem;
    private String reveivedPublicKey;

    public Messenger() {
        publicKeyCryptoSystem = cryptoSystemFactory.getPublicKeyCryptoSystemFactory().createNTRUCryptosystem();

    }

    public void establishConnection(ConnectionNode connectionNodeSender, ConnectionNode connectionNodeReceiver) {
        connectionManager.openConnection(connectionNodeSender, connectionNodeReceiver, publicKeyCryptoSystem.getPublicKey());
        reveivedPublicKey = connectionManager.retrievePublicKey();
    }

    public void sendMessage(String message) {
        if (reveivedPublicKey != null) {
            String encryptedMessage = publicKeyCryptoSystem.encrypt(message, reveivedPublicKey);
            connectionManager.sendMessage(encryptedMessage);
        } else {
            throw new PublicKeyNotFoundException();
        }
    }

    public void closeConnection() {
        connectionManager.closeConnection();
    }

}
