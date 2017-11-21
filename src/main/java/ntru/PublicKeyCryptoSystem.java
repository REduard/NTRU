package ntru;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public interface PublicKeyCryptoSystem {

    String encrypt(String plainText, String publicKey);

    String decrypt(String plainText);

    String getPublicKey();
}
