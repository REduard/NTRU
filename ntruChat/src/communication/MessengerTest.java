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
        messenger.establishConnection();
        assertNotNull(messenger.getConnectionManager().getConnection());
    }

}