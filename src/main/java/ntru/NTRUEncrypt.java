package ntru;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ThreadLocalRandom;

public class NTRUEncrypt 
{
	
	private Integer N;
	private Integer p;
	private Integer q;
	private Integer d;
	
	private Polynomial f;
	private Polynomial g;
	private Polynomial fp;
	private Polynomial fq;
	private Polynomial h;
		
	private static NTRUEncrypt instance = null;
	
	public Bmessage message;
	
	
	public Integer getD() 
	{
		return d;
	}

	public void setD(Integer d) 
	{
		this.d = d;
	}
	
	public Integer getN() 
	{
		return N;
	}

	public void setN(Integer n) 
	{
		N = n;
	}

	public Integer getP() 
	{
		return p;
	}

	public void setP(Integer p) 
	{
		this.p = p;
	}

	public Integer getQ() 
	{
		return q;
	}

	public void setQ(Integer q) 
	{
		this.q = q;
	}

	private NTRUEncrypt (Integer N, Integer P, Integer Q, Integer D)  // q>(6d+1)p ; N,p - prime ; (p,q)=1 , (N,q)=1; 
	{
		
		setN(N);
		setP(P);
		setQ(Q);
		setD(D);
		
		generateKeys();
		
	}
	
	public static NTRUEncrypt getInstance(Integer N, Integer P, Integer Q, Integer D) 
	{
	      if(instance == null) 
	      {
	         instance = new NTRUEncrypt(N, P, Q, D);
	      }
	      return instance;
	}
	
	public Polynomial Encrypt (String m) throws UnsupportedEncodingException
	{
		message = new MessageProxy();
		
		Polynomial messagePolynomial = new Polynomial();
		Polynomial randomPolynomial = new Polynomial();
				
		randomPolynomial.GenerateRandomPolynomial( ThreadLocalRandom.current().nextInt(1, N-1) );
		
		messagePolynomial.ConvertFromMessage( message.ConvertToBinary(m) );
		
		randomPolynomial.MultiplyPolynomial(h); //randomPoly trebuie sa aiba grad mai mic ca h, altfel da eroare functia.
		randomPolynomial.AddPolynomial(messagePolynomial);
		randomPolynomial.ModuloPolynomialConst(q);
		
		return randomPolynomial;
	}
	
	public Polynomial getPublicKey ()
	{
		return h; 
	}
	
	public Polynomial getPrivateKey1()
	{
		return f;
	}
	
	public Polynomial getPrivateKey2()
	{
		return fp;
	}
	
	public void generateKeys ()
	{
		f = new Polynomial();
		g = new Polynomial();
		
		
		h = new Polynomial();
		h.GenerateRandomPolynomial(N);
	}
}
