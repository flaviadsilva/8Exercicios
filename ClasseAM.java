package classeam;

public class ClasseAM {

    public static void main(String[] args) {

        Golfinho G1 = new Golfinho("Oceano Pacífico");
        G1.definirSaltos(10.0);
        G1.mostrarInfo();
        Tubarão T1 = new Tubarão("Oceano Pacífico");
        T1.definirDentes(50);
        T1.mostrarInfo();

    }
}
