/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagemjogo;

/**
 *
 * @author aluno.saolucas
 */
public class PersonagemJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mago mago = new Mago(100);
        Guerreiro guerreiro = new Guerreiro(100);

        mago.definirMana(50.0); 
        mago.definirMana(30); 

        guerreiro.definirForca(75);

        System.out.println("Ataque do Mago:");
        mago.atacar();

        System.out.println("Ataque do Guerreiro:");
        guerreiro.atacar();
        System.out.println("Energia do Mago após ataque: " + mago.getEnergia());
        System.out.println("Mana do Mago após ataque: " + mago.getMana());

        System.out.println("Energia do Guerreiro após ataque: " + guerreiro.getEnergia());
    }
}
   
