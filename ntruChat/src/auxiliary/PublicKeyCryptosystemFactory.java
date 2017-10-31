package auxiliary;

import auxiliary.otherCryptosystems.RSACryptosystem;
import ntru.NTRUCryptosystem;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class PublicKeyCryptosystemFactory {
    static NTRUCryptosystem createNTRUCryptosystem() {
        return new NTRUCryptosystem();
    }

    static RSACryptosystem createAESCryptosystem() {
        return null;
    }
}
