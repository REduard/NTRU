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
public class NTRUKeyPair {
    private NTRUPrivateKey privateKey;
    private NTRUPublicKey publicKey;

    public NTRUPrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(NTRUPrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public NTRUPublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(NTRUPublicKey publicKey) {
        this.publicKey = publicKey;
    }
}
