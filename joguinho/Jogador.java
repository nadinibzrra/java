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
public class Jogador {
    private String nome;
    private int valorAposta;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public String getNome(){ 
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getValorAposta(){
        return valorAposta;
    }
    
    public void setValorAposta(int valorAposta){
        this.valorAposta = valorAposta;
    }
}