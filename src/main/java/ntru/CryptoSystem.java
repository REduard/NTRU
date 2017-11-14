package ntru;

import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public interface CryptoSystem {
   String encrypt(String plainText);
   String decrypt(String plainText, String publicKey);

}
