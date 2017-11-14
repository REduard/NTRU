package ntru;

import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component(value="ntruCryptosystem")
public class NTRUCryptosystem implements CryptoSystem {
    private NTRUEncrypt ntruEncrypt;
    private NTRUDecrypt ntruDecrypt;

    public NTRUCryptosystem() {
        ntruEncrypt = NTRUEncrypt.getInstance();
        ntruDecrypt = NTRUDecrypt.getInstance();
    }

    @Override
    public String encrypt(String plainText) {
        System.out.println(plainText);
       return ntruEncrypt.Encrypt();
    }

    @Override
    public String decrypt(String plainText, String publicKey) {
        System.out.println(plainText);
        return ntruDecrypt.Decrypt();
    }
}
