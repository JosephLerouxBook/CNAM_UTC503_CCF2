import java.util.Date;

public class rpg extends Jeu implements abonnement{
    public String rang;
    public String guildName;
    public int charNbr;

    // Ecrasement du constructeur parent
    public rpg(String rang, String guildname, int charNbr, String nom) {
        super(nom);
        this.rang = rang;
        this.guildName = guildname;
        this.charNbr = charNbr;
    }

    // Affichage
    public void afficher() {
        System.out.println("Vous avez joué " + duree + " heures au jeu " + nom + ", ce qui représente " + succes
                + " % des succès. Votre rang est " + rang + " Votre guilde est " + guildName + ", Vous avez " + charNbr
                + " personnages. En ce qui concerne votre abonnement : " + this.payerAbonnement());
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

    // Setters
    public void setGuildName(String guildname) {
        this.guildName = guildname;
    }

    public void setCharNbr(int charNbr) {
        this.charNbr = charNbr;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    // Getters
    public String getGuildName() {
        return this.guildName;
    }

    public int getCharNbr() {
        return this.charNbr;
    }

    public String getRang() {
        return this.rang;
    }

}
