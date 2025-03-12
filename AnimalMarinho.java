package classeam;

public abstract class AnimalMarinho {
    protected String habitat;

    public AnimalMarinho(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    
     public void SetHabitat(String habitat) {
        this.habitat = habitat;
    }
    
     public abstract void fazerSom();
}

