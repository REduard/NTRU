package communication;

import ntru.CryptoSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component
public class Messenger {
    @Autowired
    private CryptoSystem cryptoSystem;
    @Autowired
    private ConnectionManager connectionManager;

    public void sendMessage(String s) {
        throw new UnsupportedOperationException();
    }

    public void establishConnection() {
        throw new UnsupportedOperationException();
    }

    public void onMessageRecieved() {
        throw new UnsupportedOperationException();
    }

    public void generateKeys() {
        throw new UnsupportedOperationException();
    }

    public void closeConnection() {
        throw new UnsupportedOperationException();
    }

    public void displayError() {
        throw new UnsupportedOperationException();
    }

    public CryptoSystem getCryptoSystem() {
        return cryptoSystem;
    }

    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }
}
