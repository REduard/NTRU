package ntru;

public class NTRUDecrypt {
	
	private Integer N;
	private Integer p;
	private Integer q;
	
	private Polynomial f;
	private Polynomial g;
	private Polynomial fp;
	private Polynomial fq;
	private Polynomial b;
	private Polynomial e;
	private Polynomial c;

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
