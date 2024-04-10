import java.util.Date;

public class indie extends Jeu implements abonnement, VRhandler {
    private String studio;
    private int isVR;

    // Ecrasement du constructeur parent
    public indie(String nom, String studio) {
        super(nom);
        this.studio = studio;
        this.isVR = 0;
    }

    // Affichage
    public void afficher() {
        System.out.println("Vous avez joué " + duree + " heures au jeu " + nom + ", ce qui représente " + succes
                + " % des succès. Le studio de developpement derriere ce jeu est " + studio
                + ". En ce qui concerne votre abonnement : " + this.payerAbonnement() + ". ");
        if (isVR == 1) {
            System.out.println("Votre jeu est configuré pour de la VR");
        } else {
            System.out.println("Votre jeu n'est pas configuré pour de la VR");
        }
    }

    public String payerAbonnement() {
        Date date = new Date();
        String output;

        if (date.getDay() == 1) {
            output = "Merci de ne pas oublier de payer votre abonnement pour le jeu " + this.nom;
        } else {
            output = "Vous n'avez pas encore a payer votre abonnement.";
        }
        return (output);
    }

    public String passerEnVR() {
        this.isVR = 1;
        return ("Votre jeu " + this.nom + " est maintenant configuré pour un casque VR");
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getStudio() {
        return this.studio;
    }
}
