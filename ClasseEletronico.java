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
public class ClasseEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Celular celular = new Celular("Samsung");
        Notebook notebook = new Notebook("Dell");

        celular.definirTela(6.5);
        celular.definirTela(6); 

        notebook.definirRam(16);

        System.out.println("Celular da marca: " + celular.getMarca());
        System.out.println("Tamanho da tela do celular: " + celular.getTela() + " polegadas");
        celular.ligar();

        System.out.println("Notebook da marca: " + notebook.getMarca());
        System.out.println("RAM do notebook: " + notebook.getRam() + "GB");
        notebook.ligar();
    }
    
}
