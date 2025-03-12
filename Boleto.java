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
public class Boleto extends Pagamentos{

    private String codigoBarras;

    public Boleto(double valor) {
        super(valor); 
    }

    public void definirCodigo(String codigo) {
        this.codigoBarras = codigo; 
    }
    
    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    public void setCodigoBarras() {
        this.codigoBarras = codigoBarras;
    }
       public void mostrarInfo() {
        System.out.println("Codigo:" + codigoBarras);
        System.out.println("Valor: " + valor);

    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " processado com Boleto. Código de Barras: " + codigoBarras);
    }
     public void ExibirDetalhes() {
    }

}

    

