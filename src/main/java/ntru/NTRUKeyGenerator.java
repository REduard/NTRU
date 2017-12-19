/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntru;

/**
 *
 * @author Andrei
 */
public class NTRUKeyGenerator {
    private final int N;
    private final int p;
    private final int q;
    
    public NTRUKeyGenerator(int N, int p, int q){
        this.N = N;
        this.p = p;
        this.q = q;
    }
    
    public NTRUKeyPair generateKey(){
        Polynomial f = new Polynomial();
        Polynomial g = new Polynomial();
        Polynomial fp;
        
        Polynomial h;
        
        g.GenerateRandomTernaryPolynomial(N);
        
        do{
            f.GenerateRandomTernaryPolynomial(N);
            fp = f.FindPolynomialInverse(p);
        }while(fp != null && f.FindPolynomialInverse(q) != null);
        
        NTRUKeyPair keyPair = new NTRUKeyPair();
        
        h = fp.getClone();
        h.MultiplyPolynomialConst(p);
        h.MultiplyPolynomial(g);
        h.ModuloPolynomialConst(q);
        
        keyPair.setPublicKey(new NTRUPublicKey());
        keyPair.getPublicKey().setN(N);
        keyPair.getPublicKey().setP(p);
        keyPair.getPublicKey().setQ(q);
        keyPair.getPublicKey().setH(h);
        
        keyPair.setPrivateKey(new NTRUPrivateKey());
        keyPair.getPrivateKey().setF(f);
        keyPair.getPrivateKey().setFp(fp);
        
        return keyPair;
    }
}
