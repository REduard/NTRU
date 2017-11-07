import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionManager {

    @Test
    public void testOpenConnection() {
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.openConnection("86.134.176.128","80");
        assertNotNull(connectionManager.getConnection());
    }

    @Test
    public void testCloseConnection() {
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.closeConnection();
        assertNull(connectionManager.getConnection());
    }

}