public class App {
    public static void main(String[] args) throws Exception {
        Jeu jeu1 = new Jeu("the wutcher");
        jeu1.afficher();

        fpssolo jeuFPS1 = new fpssolo("COD", "Ecarlate");
        jeuFPS1.afficherFPS();
        jeuFPS1.afficher();

        rpg jeuRPG1 = new rpg("JusteLeMeilleur", "Millenium", 18, "WoW");
        jeuRPG1.afficher();
        jeuRPG1.afficher();
        System.out.println(jeuRPG1.payerAbonnement());

        indie jeuIndie1 = new indie("Palword", "Pocket Pair");
        jeuIndie1.afficher();
        jeuIndie1.afficher();
        System.out.println(jeuIndie1.payerAbonnement());

        battleRoyale jeuBR1 = new battleRoyale("Warzone", "Diamant", 2400);
        jeuBR1.afficher();
        jeuBR1.afficher();
    }
}
