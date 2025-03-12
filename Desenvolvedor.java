package classefuncionario;

public class Desenvolvedor extends Funcionario{
    private int horasTrabalhadas;

       public Desenvolvedor(String nome, double salario) {
        super(nome);
    }
    
    public void definirHorasTrabalhadas(int horas) {
        this.horasTrabalhadas = horas;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int gethorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void sethorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void mostrarInfo() {
        System.out.println("Nome:" + nome);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }
    
    @Override
    public void ExibirDetalhes(){
        
    }
    
    public void CalcularSalario(){
        
    }

}


