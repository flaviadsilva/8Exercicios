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
public class TiposPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito(1000.0);
        Boleto boleto = new Boleto(200.0);

        cartaoCredito.definirLimite(1500); 
        cartaoCredito.definirLimite(1200.50);

        boleto.definirCodigo("12345678901234567890");

        cartaoCredito.processarPagamento();
        boleto.processarPagamento(); 
    }
}
