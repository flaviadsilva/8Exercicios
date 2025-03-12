package classefuncionario;

public class ClasseFuncionario {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Flávia");
        g1.setnome("Flávia");
        g1.setbonus(5000.00);
        g1.definirBonus(1500.50);
        g1.mostrarInfo();
        
       Desenvolvedor dev1 = new Desenvolvedor("Flávia", 4000.00);
       
       dev1.setnome("Flávia");
       dev1.sethorasTrabalhadas(4000);
       dev1.definirHorasTrabalhadas(4000);
       dev1.mostrarInfo();
    }

    }
