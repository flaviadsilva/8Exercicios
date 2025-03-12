
package contabancaria;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(double saldo) {
        super(saldo); 
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
        System.out.println("Saldo: " + saldo);

    }

    @Override
    public void calcularJuros() {

        System.out.println("Conta Corrente não tem juros.");
    }
      public void ExibirDetalhes() {
    }


}

    

