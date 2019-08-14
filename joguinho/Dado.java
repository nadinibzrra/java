/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinho;

/**
 *
 * @author Aluno
 */
public class Dado {
    private int valorFace;

    public int getValor() {
        return valorFace;
    }

    public void Dado(int valorFace) {
        this.valorFace = valorFace;
    }
    
    public void setValor(){
        valorFace = (int)(1 + Math.random() * 6);
    }
}
