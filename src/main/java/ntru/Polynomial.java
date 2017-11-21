package ntru;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
@Component(value="polynomial")
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

	public ArrayList<Integer> getCoef() 
	{
		return coef;
	}

	public void setCoef(ArrayList<Integer> coef) 
	{
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

	public void ConvertFromMessage (String message)   //conversie binara
	{
		this.N = message.length(); 
		this.coef.clear();
		
		int c;
		
		for (int i = 0; i < this.N; i++)
		{
			c = Integer.parseInt(Character.toString(message.charAt(i)));
			this.coef.add(c);
		}
	}

	public String ConvertToMessage()
	{
		String result = "";
		
		for (int i = 0; i<this.N;i++)
			result += this.coef.get(i).toString();
		
		return result;	
	}

	public void AddPolynomial (Polynomial B)
	{
		int i, sum = 0;
		
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
		int newMaxDegree, maxP = (this.N > B.N) ? this.N : B.N, minP = (this.N < B.N) ? this.N : B.N;
		
		newMaxDegree = this.N + B.N;
		
		Polynomial result = new Polynomial(newMaxDegree - 1);
				
		int position=0;
		
		for ( int i = 0; i < minP; i++)
		{
			for (int j = 0; j < maxP; j++)
			{
				result.getCoef().set(j + position, result.getCoef().get(j + position) + this.coef.get(i)*B.getCoef().get(j));
			}
			position++;
		}
		
		//result.PrintPolynomial();
		
		this.coef.clear();
		this.N = result.N;
		
		for ( int i = 0; i < result.N; i++)
			this.coef.add(result.getCoef().get(i));
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

	public void GenerateRandomTernaryPolynomial (Integer N) //genereaza polinom cu coef -1, 0, 1
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
	
	public void GenerateRandomTernaryPolynomialEqual (Integer N)  //genereaza polinom cu coef -1, 0, 1 cu nr egal de coeficienti -1 si 1.
	{
		int randomNum;
		
		int nr1, nrM1, nr0;
		
		if ( N%2 == 0)
		{
			nr1 = ThreadLocalRandom.current().nextInt(1, N/2);
			nrM1 = nr1;
			nr0 = N - nr1 - nrM1;
		}
		
		else 
		{
			nr1 = ThreadLocalRandom.current().nextInt(1, N/2 + 1);
			nrM1 = nr1;
			nr0 = N - nr1 - nrM1;
		}
		
		/*
		System.out.print(nrM1); 		System.out.print(nr0); 		System.out.print(nr1);
		System.out.println();
		*/
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.clear();
				
		this.N = N;
		this.coef.clear();
		
		randomNum = ThreadLocalRandom.current().nextInt(-1, 2);
		while (randomNum == 0)
			randomNum = ThreadLocalRandom.current().nextInt(-1, 2);

		if (randomNum == -1)
			nrM1 -= 1;
		else if (randomNum == 1)
			nr1 -= 1;

		result.add(randomNum);
		
		for (int i = N-2; i>=0;i--)
		{
			if (nr1 != 0 && nr1 >=1)
			{
				nr1--;
				result.add(1);
			}
			else if ( nrM1 != 0 && nrM1 >=1)
			{
				nrM1--;
				result.add(-1);
			}
			else
			{
				nr0--;
				result.add(0);
			}
		}
		
		Collections.shuffle(result);
		
		while (result.get(0) == 0)
			Collections.shuffle(result);
		
		Collections.reverse(result);
		
		for (int i = 0; i < result.size(); i++)
		{
			this.coef.add(result.get(i));
		}
		
	}
	
	public void PrintPolynomial()
	{
		for (int i = 0; i < N; i++)
		{
			if (i != N - 1 )
			{
				System.out.print(this.coef.get(i) + "*x^" + i);
				System.out.print(" + ");
			}
			else
				System.out.print(this.coef.get(i) + "*x^" + i);			
		}
		System.out.println();
	}
	
	public void FindPolynomialInverse()
	{

	}
}
