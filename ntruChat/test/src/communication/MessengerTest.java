import static org.junit.Assert.*;

import org.junit.Test;

public class MessengerTest {

    @Test
    public void testGenerateKeys() {
        Messenger messenger = new Messenger();
        messenger.generateKeys();
        ArrayList<Integer> keys = messenger.getCryptoSystem().getKey();
        assertNotNull(keys);
    }

    @Test
    public void testEstablishConnection() {
        Messenger messenger = new Messenger();
        messenger.establishConnection("86.134.176.128","80");
        assertNotNull(messenger.getConnectionManager().getConnection());
    }

    @Test
    public void testCloseConnection() {
        Messenger messenger = new Messenger();
        messenger.closeConnection();
        assertNull(messenger.getConnectionManager().getConnection());
    }
}