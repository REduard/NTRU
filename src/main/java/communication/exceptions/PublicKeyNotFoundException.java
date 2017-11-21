package communication.exceptions;

/**
 * Created by R.Eduard on 21.11.2017.
 */
public class PublicKeyNotFoundException extends RuntimeException {
    public PublicKeyNotFoundException() {
        super("Public key was not retrieved from the other user.\n Messages cannot be encrypted without the receiver's public key.");
    }
}
