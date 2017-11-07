package ntru;

public class Main {

    public static void main(String[] args)
    {

        //NTRUEncrypt A = new NTRUEncrypt();
        //NTRUDecrypt B = new NTRUDecrypt();

        //NTRUEncrypt A = NTRUEncrypt.getInstance();
        //A.TEST();
        //NTRUEncrypt B = NTRUEncrypt.getInstance();
        //B.TEST2();

        Polynomial a;
        a = new Polynomial (5);

        Polynomial b;
        b = new Polynomial ();

        //a.GenerateRandomPolynomial(3);
        b.GenerateRandomPolynomial(3);

        for (int i = 0; i<a.getN();i++)
        {
            System.out.print(a.getCoef().get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i<b.getN();i++)
        {
            System.out.print(b.getCoef().get(i) + " ");
        }

        System.out.println();
        a.AddPolynomial(b);
        a.MultiplyPolynomialConst(2);
        System.out.println();

        for (int i = 0; i<a.getN();i++)
        {
            System.out.print(a.getCoef().get(i) + " ");
        }

        a.ModuloPolynomialConst(3);
        System.out.println();

        for (int i = 0; i<a.getN();i++)
        {
            System.out.print(a.getCoef().get(i) + " ");
        }

        a.GenerateRandomTernaryPolynomial(5);
        a.GenerateRandomPolynomial(3);

        System.out.println();
        System.out.println();


        for (int i = 0; i<a.getN();i++)
        {
            System.out.print(a.getCoef().get(i) + " ");
        }
        //System.out.println("Done!");

    }

}
