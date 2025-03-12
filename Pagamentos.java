/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipospagamento;

/**
 *
 * @author aluno.saolucas
 */

public abstract class Pagamentos{
 
    protected double valor;

    public Pagamentos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
     public void setValor() {
        this.valor = valor;
    }
       public abstract void processarPagamento();
    
}
