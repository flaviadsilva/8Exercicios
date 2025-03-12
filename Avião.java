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
public class Avião extends Transporte {


    private int altitudeMaxima;

    public Avião(int capacidade) {
        super(capacidade); 
    }

    public void definirAltitude(int altitude) {
        this.altitudeMaxima = altitude;
    }
    
    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }
    
    public void setAltitudeMaxima() {
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public void mover() {
        System.out.println("O Avião está voando a " + altitudeMaxima + " metros de altitude.");
    }

}

    

