package ntru;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component(value = "ntruCryptosystem")
public class NTRUCryptosystem implements PublicKeyCryptoSystem {
    private NTRUEncrypt ntruEncrypt;
    private NTRUDecrypt ntruDecrypt;

    public NTRUCryptosystem() {
//        ntruEncrypt = NTRUEncrypt.getInstance();
        ntruDecrypt = NTRUDecrypt.getInstance();
    }

    @Override
    public String encrypt(String plainText, String publicKey) {
        System.out.println(plainText);
        return "";//ntruEncrypt.Encrypt(plainText);
    }

    @Override
    public String decrypt(String plainText) {
        System.out.println(plainText);
        return ntruDecrypt.Decrypt();
    }

    @Override
    public String getPublicKey() {
        return null;
    }
}
