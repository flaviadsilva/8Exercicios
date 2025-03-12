package classeam;

public class Golfinho extends AnimalMarinho {

    private int saltos;

    public Golfinho(String habitat) {
        super(habitat);
    }

    public void definirSaltos(int saltos) {
        this.saltos = saltos;
    }

    public void definirSaltos(double saltos) {
        this.saltos = (int) saltos;
    }

    public int getSaltos() {
        return saltos;
    }

    public void setSaltos(int saltos) {
        this.saltos = saltos;
    }

    public void mostrarInfo() {
        System.out.println("habitat:" + habitat);
        System.out.println("saltos: " + saltos);

    }

    @Override
    public void fazerSom() {
        System.out.println("O golfinho faz assobios");
    }

    public void ExibirDetalhes() {
    }

   

    

}
