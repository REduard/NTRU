package communication;

import ntru.CryptoSystem;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class Messenger {
    private CryptoSystem cryptoSystem;
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
