package auxiliary;

import auxiliary.otherCryptosystems.AESCryptosystem;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class SymmetricKeyCryptosystemFactory {
    static AESCryptosystem createAESCryptosystem() {
        return new AESCryptosystem();
    }
}
