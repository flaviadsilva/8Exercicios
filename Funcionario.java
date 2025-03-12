package classefuncionario;

public abstract class Funcionario {
    protected double salario;
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
        
    }
    public Funcionario (double salario){
        this.salario = salario; 
        
    }
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
   
    public abstract void CalcularSalario();
    public abstract void ExibirDetalhes();
}

