/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinho;

import java.util.Scanner;
import joguinho.Jogador;
import joguinho.Dado;

/**
 *
 * @author Aluno
 */
public class Jogo {

    public int resultado;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Jogador jogador1, jogador2;
    private Scanner entrada = new Scanner(System.in);

    public void inserirJogadores() {
        System.out.println("Jogador 1 informe o nome: ");
        jogador1 = new Jogador(entrada.next());
        
        System.out.println("Jogador 2 informe o nome: ");
        jogador2 = new Jogador(entrada.next());
    }

    public void inserirAposta() {
        int aposta;
        do{
            System.out.println("Inserir: " + "informe sua aposta");
            aposta = entrada.nextInt();
        }while(aposta < 2 || aposta > 12);
        jogador1.setValorAposta(aposta);
         do {
            System.out.println(jogador2.getNome() + "informe sua aposta:");
            aposta = entrada.nextInt();
            if (aposta == jogador1.getValorAposta()) {
                System.out.println("Valor ja escolhido. Tente outro.");
            }
        } while (aposta < 2 || aposta > 12 || aposta == jogador1.getValorAposta());
        jogador2.setValorAposta(aposta);
    }

    public void jogarDados() {
        dado1.setValor();
        dado2.setValor();
    }

    public void mostrarResultado() {
        resultado = dado1.getValor() + dado2.getValor();
        System.out.println("resultado " +resultado); 
    }

    public void mostrarVencedor() {
        if(resultado == jogador1.getValorAposta()){
            System.out.println("Jogador 1 venceu a aposta");
        }else if(resultado == jogador2.getValorAposta()){
            System.out.println("Jogador 2 venceu a aposta");
        }else{
            System.out.println("Computador venceu");
        }
    }
    
}
