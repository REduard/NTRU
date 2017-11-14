package ntru;

public class NTRUEncrypt {
	
	public Integer N = 2;
	private Integer p;
	private Integer q;
	
	private Polynomial f;
	private Polynomial g;
	private Polynomial fp;
	private Polynomial fq;
	private Polynomial h;
	private Polynomial e;
	
	private static NTRUEncrypt instance = null;
	
	public Bmessage message;
	
	private NTRUEncrypt () {}
	
	public static NTRUEncrypt getInstance() 
	{
	      if(instance == null) 
	      {
	         instance = new NTRUEncrypt();
	      }
	      return instance;
	}
	
	public String Encrypt ()
	{
		return null;
	}
	
	public String GenerateKeys ()
	{
		return null;
	}
}
