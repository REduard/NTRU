package test;

import static org.junit.Assert.*;

import org.junit.Test;

import NTRUpak.Polynomial;

public class PolynomialTest {

	private Polynomial a = new Polynomial (3);
	
	@Test
	public void testGetN() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetN() {
		fail("Not yet implemented");
	}

	@Test
	public void testPolynomialInt() {
		fail("Not yet implemented");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAddPolynomial() 
	{
		//fail("Not yet implemented");
		Polynomial result = new Polynomial (3);
		Polynomial b = new Polynomial (3);
		int temp = 0;
		
		for (int i = 0; i< b.getN(); i++)
		{
			temp = temp + 1;
			b.getCoef().set(i, temp); //1, 2, 3 
		}
		
		temp = 0;
		
		for (int i = 0; i< a.getN(); i++)
		{
			temp = temp + 1;
			a.getCoef().set(i, temp); //1, 2, 3 
		}
		
		temp = 0;
		
		for (int i = 0; i< result.getN(); i++)
		{
			temp = temp + 2;
			result.getCoef().set(i, temp); //2, 4, 6 
		}
		
		a.AddPolynomial(b);
		assertEquals(a.getCoef().toArray(), result.getCoef().toArray());
	}

	@Test
	public void testMultiplyPolynomialConst() {
		fail("Not yet implemented");
	}

	@Test
	public void testModuloPolynomialConst() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateRandomPolynomial() {
		fail("Not yet implemented");
	}

}
