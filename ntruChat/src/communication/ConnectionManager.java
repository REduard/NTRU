package communication;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class ConnectionManager extends RuntimeException {
    public Integer senderIpAddress;
    public Integer senderPort;
    public Integer receiverIpAddress;
    public Integer receiverPort;

    public ConnectionManager() {
    }

    public Connection openConnection() {
        throw new UnsupportedOperationException();
        return null;
    }
    public void sendMessage(String s) {
        throw new UnsupportedOperationException();
        return null;
    }
    public void closeConnection() {
        throw new UnsupportedOperationException();
        return null;
    }
}
