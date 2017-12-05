package ntru;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

    	//NTRUEncrypt A = new NTRUEncrypt();
    	//NTRUDecrypt B = new NTRUDecrypt();
    			
    	//NTRUEncrypt A = NTRUEncrypt.getInstance();
    	//A.TEST();
    	//NTRUEncrypt B = NTRUEncrypt.getInstance();
    	//B.TEST2();
    			
    	/*
    	Polynomial a;
    	a = new Polynomial (5);
    			
    	Polynomial b;
    	b = new Polynomial ();
    					
    	a.GenerateRandomPolynomial(2);
    	b.GenerateRandomPolynomial(3);
    	a.PrintPolynomial();
    	b.PrintPolynomial();
    			
    	System.out.println();
    			
    	a.MultiplyPolynomial(b);
    	a.PrintPolynomial();
    			
    	System.out.println();
    	System.out.println();
    			
    	a.GenerateRandomTernaryPolynomial(2);
    	b.GenerateRandomTernaryPolynomial(3);
    	a.PrintPolynomial();
    	b.PrintPolynomial();
    			
    	System.out.println();
    			
    	a.MultiplyPolynomial(b);
    	a.PrintPolynomial();
    	*/
    			
    	String message = "Gigi are 2 mere !!?";
    			
    	Bmessage m = new MessageProxy();
    			
    	String convert = m.ConvertToBinary(message);
    			
    	System.out.println(convert);
    			
    	String convertedBack = m.ConvertFromBinary(convert);
    			
    	System.out.println(convertedBack);
    			
    	//////
    	System.out.println();
    	System.out.println();
    	//////
    			
    	Polynomial t = new Polynomial();
    	t.ConvertFromMessage(convert);
    	System.out.println("converted to polynomial:");
    	t.PrintPolynomial();
    			
    	System.out.println();

    	String fromPol = t.ConvertToMessage();
    			
    	System.out.println("converted from polynomial:");
    	System.out.println(fromPol);
    			
    	System.out.println();
    	System.out.println(m.ConvertFromBinary(fromPol));

    }

}
