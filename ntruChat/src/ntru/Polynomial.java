package NTRUpak;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Polynomial
{

	private ArrayList<Integer> coef;
	private int N;

	public int getN()
	{
		return N;
	}

	public void setN(int n)
	{
		this.N = n;
	}

	public ArrayList<Integer> getCoef() {
		return coef;
	}

	public void setCoef(ArrayList<Integer> coef) {
		this.coef = coef;
	}

	public Polynomial ()
	{
		this.coef = new ArrayList<Integer>();
		this.N = 0;
	}

	public Polynomial (int N)
	{
		this.coef = new ArrayList<Integer>(N);
		this.N = N;

		for ( int i = 0; i < N; i++ )
			this.coef.add(0);
	}

	public void ConvertFromMessage (String message)
	{

	}

	public String ConvertToMessage()
	{
		return null;
	}

	public void AddPolynomial (Polynomial B)
	{
		int i, sum = 0, minP = (this.N < B.N) ? this.N : B.N, maxP = (this.N > B.N) ? this.N : B.N;

		if ( this.N > B.N)
		{
			for ( i = 0; i < B.N; i++)
			{
				sum = this.coef.get(i) + B.coef.get(i);
				this.coef.set(i, sum);
			}
		}
		else
		{
			for ( i = 0; i < this.N; i++)
			{
				sum = this.coef.get(i) + B.coef.get(i);
				this.coef.set(i, sum);
			}

			for ( i = this.N; i<B.N;i++)
			{
				this.coef.add(B.getCoef().get(i));
			}

			this.N = B.N;
		}

	}

	public void MultiplyPolynomial (Polynomial B)
	{

	}

	public void MultiplyPolynomialConst (Integer c)
	{
		for (int i = 0; i < this.N; i++)
			this.coef.set(i, this.coef.get(i)*c);
	}

	public void ModuloPolynomialConst (Integer c)
	{
		for (int i = 0; i < this.N; i++)
			this.coef.set(i, this.coef.get(i)%c);
	}

	public void GenerateRandomPolynomial (Integer N)
	{
		int randomNum;

		if ( this.N != N)
		{
			this.N = N;
			this.coef.clear();
			for (int i = 0; i<N; i++)
			{
				if (i == N-1)
				{
					randomNum = ThreadLocalRandom.current().nextInt(1, 26);
					this.coef.add(randomNum);
				}
				else
				{
					randomNum = ThreadLocalRandom.current().nextInt(0, 26);
					this.coef.add(randomNum);
				}
			}
		}
		else
		{
			for (int i = 0; i<N; i++)
			{
				if (i == N-1)
				{
					randomNum = ThreadLocalRandom.current().nextInt(1, 26);
					this.coef.set(i,randomNum);
				}
				else
				{
					randomNum = ThreadLocalRandom.current().nextInt(0, 26);
					this.coef.set(i,randomNum);
				}
			}
		}

	}

	public void GenerateRandomTernaryPolynomial (Integer N)
	{
		int randomNum;

		if ( this.N != N)
		{
			this.N = N;
			this.coef.clear();
			for (int i = 0; i<N; i++)
			{
				if (i == N-1)
				{
					randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					while (randomNum == 0)
						randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					this.coef.add(randomNum);
				}
				else
				{
					randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					this.coef.add(randomNum);
				}
			}
		}
		else
		{
			for (int i = 0; i<N; i++)
			{
				if (i == N-1)
				{
					randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					while (randomNum == 0)
						randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					this.coef.set(i, randomNum);
				}
				else
				{
					randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
					this.coef.set(i, randomNum);
				}
			}
		}
	}

	public void FindPolynomialInverse()
	{

	}
}
