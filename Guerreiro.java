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
public class Guerreiro extends Personagem{

    private int forca;


    public Guerreiro(int energia) {
        super(energia);
    }


    public void definirForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca() {
        this.forca = forca;
    }


    @Override
    public void atacar() {
        if (energia > 0) {
            System.out.println("O Guerreiro atacou com força!");
            energia -= 5; 
        } else {
            System.out.println("O Guerreiro não tem energia suficiente para atacar.");
        }
    }


}

    

