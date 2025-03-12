
package classeeletronico;

public abstract class Eletronico {

    protected String marca;

    public Eletronico(String marca) {
        this.marca = marca;
    }

    public abstract void ligar();

    public String getMarca() {
        return marca;
    }
       public void setMarca() {
        this.marca = marca;
    }

    }


    

