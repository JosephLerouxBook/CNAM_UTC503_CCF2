public class Jeu {
    static int nombreDeJeuxTermines = 0;
    protected String nom;
    protected double duree;
    protected int succes;

    public Jeu(String nom) {
        this.nom = nom;
        this.duree = 0;
        this.succes = 0;
    }

    public void afficher() {
        System.out.println("Vous avez joué " + duree + " heures au jeu " + nom + ", ce qui représente " + succes
                + " % des succès.");
    }

    public double dureeTotale() {
        return duree * 100 / succes;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public void setSucces(int succes) {
        if (-1 < succes && succes < 101) {
            this.succes = succes;
        } else {
            System.out.println("Attention, c'est un pourcentage, il doit etre compris entre 0 et 100");
        }
        if (succes == 100) {
            nombreDeJeuxTermines++;
        }
    }
}
