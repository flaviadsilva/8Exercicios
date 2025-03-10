package veiculo;

public class Carro extends Veiculo {

    private int portas;
    protected int aro;
    protected String marca;
    private String modelo;

    public Carro(String marca, String modelo, int portas, int aro) {
        this.portas = portas;
        this.aro = aro;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public int getportas() {
        return portas;
    }

    public void setportas(int portas) {
        this.portas = portas;
    }
     public int getaro() {
        return aro;
    }

    public void setaro(int aro) {
        this.aro = aro;
    }
       public String getmarca() {
        return modelo;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void definirDetalhes(String detalhes) {

    }

    public void definirDetalhes(String marca, String modelo, int portas, int aro) {
        this.portas = portas;
        this.aro = aro;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + portas);
        System.out.println("Aro: " + aro);
    }
}
