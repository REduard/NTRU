package ntru;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class NTRUCryptosystem implements CryptoSystem {
    private NTRUEncrypt ntruEncrypt;
    private NTRUDecrypt ntruDecrypt;

    public NTRUCryptosystem() {
        ntruEncrypt = NTRUEncrypt.getInstance();
        ntruDecrypt = NTRUDecrypt.getInstance();
    }

    @Override
    public String encrypt() {
        return null;
    }

    @Override
    public String decrypt() {
        return null;
    }
}
