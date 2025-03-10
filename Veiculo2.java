package veiculo;

public abstract class Veiculo2 {

    public abstract void exibirDetalhes();
    protected String marca;
    private String modelo;

    public Veiculo2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
     public String getmarca() {
        return modelo;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

}
