package classeam;

public class Tubarão extends AnimalMarinho {

    private int dentes;

    public Tubarão(String habitat) {
        super(habitat);
    }

    public void definirDentes(int dentes) {
        this.dentes = dentes;
    }


    public int getDentes() {
        return dentes;
    }

    public void setDentes(int dentes) {
        this.dentes = dentes;
    }
    
    public void mostrarInfo() {
        System.out.println("habitat:" + habitat);
        System.out.println("dentes: " + dentes);

    }
    
    @Override
    public void fazerSom() {
        System.out.println("O tubarão faz um som baixo");
    }


}
