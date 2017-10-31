package ntru;

public class Main {

	public static void main(String[] args) 
	{
		
		//NTRUEncrypt A = new NTRUEncrypt();
		//NTRUDecrypt B = new NTRUDecrypt();
		
		NTRUEncrypt A = NTRUEncrypt.getInstance();
		A.TEST();
		NTRUEncrypt B = NTRUEncrypt.getInstance();
		B.TEST2();
		
		//System.out.println("Done!");

	}

}
