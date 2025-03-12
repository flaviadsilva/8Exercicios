/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipostransporte;

/**
 *
 * @author aluno.saolucas
 */
public class Navio extends Transporte {

    private double tonelagem;

    public Navio(int capacidade) {
        super(capacidade);
    }

    public void definirTonelagem(int tonelagem) {
        this.tonelagem = tonelagem;
    }

    public void definirTonelagem(double tonelagem) {
        this.tonelagem = tonelagem;
    }

    public double getTonelagem() {
        return tonelagem;
    }

    public void setTonelagem() {
        this.tonelagem = tonelagem;
    }

    @Override
    public void mover() {
        System.out.println("O Navio está navegando no mar.");
    }

}

