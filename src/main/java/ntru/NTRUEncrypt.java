package ntru;

public class NTRUEncrypt
{

	private static NTRUEncrypt instance = null;
	
	private NTRUEncrypt()  // q>(6d+1)p ; N,p - prime ; (p,q)=1 , (N,q)=1;
    {}
	
	public static NTRUEncrypt getInstance()
	{
	      if(instance == null) 
	      {
	         instance = new NTRUEncrypt();
	      }
	      return instance;
	}
//
//	public Polynomial Encrypt (String m) throws UnsupportedEncodingException
//	{
//		message = new MessageProxy();
//
//		Polynomial messagePolynomial = new Polynomial();
//		Polynomial randomPolynomial = new Polynomial();
//
//		randomPolynomial.GenerateRandomPolynomial( ThreadLocalRandom.current().nextInt(1, N-1) );
//
//		messagePolynomial.ConvertFromMessage( message.ConvertToBinary(m) );
//
//		randomPolynomial.MultiplyPolynomial(h); //randomPoly trebuie sa aiba grad mai mic ca h, altfel da eroare functia.
//		randomPolynomial.AddPolynomial(messagePolynomial);
//		randomPolynomial.ModuloPolynomialConst(q);
//
//		return randomPolynomial;
//	}

    public Polynomial encrypt(String m, NTRUPublicKey publicKey) {
        Polynomial message = new Polynomial();
        message.ConvertFromMessage(m);

        Polynomial encryptedMessage;
        Polynomial r = new Polynomial();

        //TODO: IMPORTANT! set small coefficients for R
        r.setCoef(Polynomial.generateCoef());
        r.GenerateRandomPolynomial(publicKey.getQ()/2);


        encryptedMessage = r.getClone();
        encryptedMessage.MultiplyPolynomial(publicKey.getH());
        encryptedMessage.AddPolynomial(message);

	    return encryptedMessage;
    }
}
