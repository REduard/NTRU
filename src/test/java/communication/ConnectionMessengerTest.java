package communication;

import auxiliary.ConnectionNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionMessengerTest {
@Autowired
    private ConnectionManager connectionManager;
    @Test
    public void testOpenConnection() {
        connectionManager.openConnection(new ConnectionNode("localhost", 64713), new ConnectionNode("localhost", 64714),"0NSrV9Xa0bD4BVJZ");


    }

    @Test
    public void testCloseConnection() {
//        ConnectionManager connectionManager = new ConnectionManager();
//        connectionManager.closeConnection();
//        assertNull(connectionManager.getConnection());
    }

}