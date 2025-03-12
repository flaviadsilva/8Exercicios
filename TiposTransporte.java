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
public class TiposTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Navio navio = new Navio(1000);
        Avião aviao = new Avião(200);

        navio.definirTonelagem(3000); 
        navio.definirTonelagem(2500); 

        aviao.definirAltitude(10000);

        System.out.println("Movimento do Navio:");
        navio.mover(); 

        System.out.println("Movimento do Avião:");
        aviao.mover(); 

  
        System.out.println("Tonelagem do Navio: " + navio.getTonelagem());
        System.out.println("Altitude do Avião: " + aviao.getAltitudeMaxima());
    }
}

    
