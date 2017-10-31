package auxiliary;

/**
 * Created by R.Eduard on 31.10.2017.
 */
public class CryptoSystemFactory {
    public PublicKeyCryptosystemFactory getPublicKeyCryptoSystemFactory(){
        return new PublicKeyCryptosystemFactory();
    }
    public SymmetricKeyCryptosystemFactory getSymmetricKeyCryptoSystemFactory(){
        return new SymmetricKeyCryptosystemFactory();
    }
}
