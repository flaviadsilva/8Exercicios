package classefuncionario;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome) {
        super(nome);
    }

    public void definirBonus(double bonus) {
        this.bonus = bonus;
    }

    public void definirBonus(int bonus) {
        this.bonus = (double) bonus;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getbonus() {
        return bonus;
    }

    public void setbonus(double bonus) {
        this.bonus = bonus;
    }

    public void mostrarInfo() {
        System.out.println("Nome:" + nome);
        System.out.println("Bônus: " + bonus);

    }

    public void ExibirDetalhes() {
    }

    public void CalcularSalario() {

    }
}
