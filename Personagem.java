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
public abstract class Personagem {

    protected int energia;

    // Construtor para inicializar a energia
    public Personagem(int energia) {
        this.energia = energia;
    }

    // Método abstrato atacar
    public abstract void atacar();

    // Getter para 'energia'
    public int getEnergia() {
        return energia;
    }

    // Setter para 'energia'
    public void setEnergia(int energia) {
        this.energia = energia;
    }
}

    

