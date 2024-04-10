public class battleRoyale extends Jeu {
    private String rang;
    private int credits;

    // Ecrasement du constructeur parent
    public battleRoyale(String nom, String rang, int credits) {
        super(nom);
        this.rang = rang;
        this.credits = credits;
    }

    // Affichage
    public void afficher() {
        System.out.println("Vous avez joué " + duree + " heures au jeu " + nom + ", ce qui représente " + succes
                + " % des succès. Votre rang est " + rang + ". Vous avez actuellement " + credits + " credits.");
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getRang() {
        return this.rang;
    }

    public int getCredits() {
        return this.credits;
    }
}
