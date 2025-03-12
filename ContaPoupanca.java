
package contabancaria;

public class ContaPoupanca extends Conta{

    private double taxaRendimento;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void definirTaxa(int taxa) {
        this.taxaRendimento = taxa / 100.0; 
    }

    public void definirTaxa(double taxa) {
        this.taxaRendimento = taxa / 100.0;
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
      public void setTaxaRendimento() {
        this.taxaRendimento = taxaRendimento;
    }
       public void mostrarInfo() {
        System.out.println("Taxa Rendimento:" + taxaRendimento);
        System.out.println("Saldo: " + saldo);

    }

    @Override
    public void calcularJuros() {
        saldo += saldo * taxaRendimento; 
    }
    public void ExibirDetalhes() {
    }


}

    

