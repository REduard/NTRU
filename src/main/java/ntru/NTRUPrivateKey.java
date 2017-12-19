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
public class NTRUPrivateKey {
    private Polynomial f;
    private Polynomial fp;

    public Polynomial getF() {
        return f;
    }

    public void setF(Polynomial f) {
        this.f = f;
    }

    public Polynomial getFp() {
        return fp;
    }

    public void setFp(Polynomial fp) {
        this.fp = fp;
    }
}
