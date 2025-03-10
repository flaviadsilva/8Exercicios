package veiculo;

public class Veiculo {

    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 4, 16);
        c1.setmarca("Toyota");
        c1.setmodelo("Corolla");
        c1.setportas(4);
        c1.setaro(16);
        c1.exibirDetalhes();
        
        Moto m1 = new Moto("Honda", "CB500", 500);
        m1.setmarca("Honda");
        m1.setmodelo("CB500");
        m1.setcilindradas(500);
        m1.exibirDetalhes();
    }
}
