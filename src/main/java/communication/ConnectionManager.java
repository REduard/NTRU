package communication;

import java.sql.Connection;

/**
 * Created by R.Eduard on 31.10.2017.
 */
//@Component
public class ConnectionManager {
    private Integer senderIpAddress;
    private Integer senderPort;
    private Integer receiverIpAddress;
    private Integer receiverPort;
    private Connection connection;

    public ConnectionManager(Integer senderIpAddress, Integer senderPort) {
    }

    public Connection openConnection(Integer senderIpAddress, Integer senderPort) {
        throw new UnsupportedOperationException();
//        return null;
    }

    public void sendMessage(String s) {
        throw new UnsupportedOperationException();
    }

    public void closeConnection() {
        throw new UnsupportedOperationException();
    }

    public Connection getConnection() {
        return connection;
    }
}