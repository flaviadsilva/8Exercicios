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
public class Mago extends Personagem{

    private double mana;


    public Mago(int energia) {
        super(energia); 
    }

  
    public void definirMana(int mana) {
        this.mana = mana; 
    }

    public void definirMana(double mana) {
        this.mana = mana; 
    }
     public double getMana() {
        return mana;
    }
      public void setMana() {
        this.mana = mana;
    }

    @Override
    public void atacar() {
        if (mana > 0) {
            System.out.println("O Mago atacou usando magia!");
            mana -= 10; 
        } else {
            System.out.println("O Mago não tem mana suficiente para atacar.");
        }
    }

   
}

    

