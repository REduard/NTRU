package ntru;

public class NTRUDecrypt {
	
	private NTRUKeyPair keyPair;
	
	private static NTRUDecrypt instance = null;

	public String Decrypt (Polynomial encriptedMessage)
	{
		Polynomial a = encriptedMessage.getClone();
		a.MultiplyPolynomial(this.keyPair.getPrivateKey().getF());

		//TODO: IMPORTANT! set coefficients for a in the interval [-q/2, q/2]
		a.setCoef(Polynomial.generateCoef(keyPair.getPublicKey().getQ()));

        a.ModuloPolynomialConst(keyPair.getPublicKey().getP());

        a.MultiplyPolynomial(this.keyPair.getPrivateKey().getFp());

        a.ModuloPolynomialConst(this.keyPair.getPublicKey().getP());

		return a.ConvertToMessage();
	}

	public void setKeyPair(NTRUKeyPair keyPair){
		this.keyPair = keyPair;
	}

	public NTRUKeyPair getKeyPair(){
		return this.keyPair;
	}

	public static NTRUDecrypt getInstance()
	{
		if(instance == null)
		{
			instance = new NTRUDecrypt();
		}
		return instance;
	}

}
