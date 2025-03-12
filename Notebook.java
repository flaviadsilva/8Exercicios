/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeeletronico;

/**
 *
 * @author aluno.saolucas
 */
public class Notebook extends Eletronico {

    private int ram;

    public Notebook(String marca) {
        super(marca); 
    }

    public void definirRam(int ram) {
        this.ram = ram;
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam() {
        this.ram = ram;
    }
    public void mostrarInfo() {
        System.out.println("Marca:" + marca);
        System.out.println("Ram: " + ram);

    }

    @Override
    public void ligar() {
        System.out.println("O notebook da marca " + marca + " está ligando!");
    }
      public void ExibirDetalhes() {
    }

}

