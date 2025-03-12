
package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);

        contaPoupanca.definirTaxa(5); 
        contaPoupanca.calcularJuros();

        contaCorrente.definirLimite(1500.0);
        contaCorrente.calcularJuros();

        System.out.println("Saldo Conta Poupança após juros: " + contaPoupanca.getSaldo());
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Limite da Conta Corrente: " + contaCorrente.getLimite());
    }
}
