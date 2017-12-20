package ntru;

public class NTRUDecrypt {
	
	private NTRUKeyPair keyPair;
	
	private static NTRUDecrypt instance = null;

	public String Decrypt ()
	{
		return null;
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
