package auxiliary;

import ntru.NTRUCryptosystem;
import ntru.PublicKeyCryptoSystem;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class PublicKeyCryptosystemFactory {
    public PublicKeyCryptoSystem createNTRUCryptosystem() {
        return new NTRUCryptosystem();
    }

    public PublicKeyCryptoSystem createAESCryptosystem() {
        return null;
    }
}
