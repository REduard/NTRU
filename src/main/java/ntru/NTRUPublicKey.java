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
public class NTRUPublicKey {
    private int N;
    private int p;
    private int q;
    
    private Polynomial h;

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public Polynomial getH() {
        return h;
    }

    public void setH(Polynomial h) {
        this.h = h;
    }
    
    
}
