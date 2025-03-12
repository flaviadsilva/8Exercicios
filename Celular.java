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
public class Celular extends Eletronico {

    private double tela;

    public Celular(String marca) {
        super(marca); 
    }

    public void definirTela(int tamanho) {
        this.tela = tamanho;
    }

    public void definirTela(double tamanho) {
        this.tela = tamanho; 
    }
    
    public double getTela() {
        return tela;
    }
    
    public void setTela() {
        this.tela = tela;
    }
    public void mostrarInfo() {
        System.out.println("Marca:" + marca);
        System.out.println("Tela: " + tela);

    }

    @Override
    public void ligar() {
        System.out.println("O celular da marca " + marca + " está ligando!");
    }
       public void ExibirDetalhes() {
    }

}
