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
public class CartaoCredito extends Pagamentos {

    private double limite;

    public CartaoCredito(double valor) {
        super(valor); 
    }

    public void definirLimite(int limite) {
        this.limite = limite; 
    }

    public void definirLimite(double limite) {
        this.limite = limite; 
    }
        public double getLimite() {
        return limite;
    }
            public void setLimite() {
        this.limite = limite;
    }
              public void mostrarInfo() {
        System.out.println("Limite:" + limite);
        System.out.println("Valor: " + valor);

    }

    @Override
    public void processarPagamento() {
        if (valor <= limite) {
            System.out.println("Pagamento de R$" + valor + " processado com Cartão de Crédito.");
        } else {
            System.out.println("Pagamento não autorizado. Limite insuficiente.");
        }
    }
     public void ExibirDetalhes() {
    }


}

