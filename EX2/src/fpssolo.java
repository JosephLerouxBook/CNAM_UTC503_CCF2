public class fpssolo extends Jeu implements VRhandler{
    private String rang;
    private int isVR;

    // Ecrasement du constructeur parents
    public fpssolo(String nom, String rang) {
        super(nom);
        this.rang = rang;
        this.isVR = 0;
    }

    // Affichage
    public void afficher() {
        System.out.println("Vous avez joué " + duree + " heures au jeu " + nom + ", ce qui représente " + succes
                + " % des succès. Votre rang est " + rang);
        if (isVR == 1) {
            System.out.println("Votre jeu est configuré pour de la VR");
        } else {
            System.out.println("Votre jeu n'est pas configuré pour de la VR");
        }
    }

    public String passerEnVR() {
        this.isVR = 1;
        return ("Votre jeu " + this.nom + " est maintenant configuré pour un casque VR");
    }

    // Setters
    public void setRang(String rang) {
        this.rang = rang;
    }

    // Getters
    public String getRang() {
        return this.rang;
    }
}
