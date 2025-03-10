package veiculo;

public class Moto extends Veiculo {

    private int cilindradas;
    protected String marca;
    private String modelo;

    public Moto(String marca, String modelo, int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public int getcilindradas() {
        return cilindradas;
    }

    public void setcilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
       public String getmarca() {
        return modelo;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void definirDetalhes(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindradas: " + cilindradas);
    }
}
