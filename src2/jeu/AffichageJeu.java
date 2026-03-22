package src2.jeu;

public class AffichageJeu implements IAffichage {

    @Override
    public void afficherDebutTour(Joueur joueur, int numTour) {
        System.out.println("========================================");
        System.out.println("Tour " + numTour + " - " + joueur.getNom());
        System.out.println("========================================");
    }

    @Override
    public void afficherResultatsDes(Joueur joueur, int valeurDes) {
        System.out.println(joueur.getNom() + " lance les dés... resultat : " + valeurDes);
    }

    @Override
    public void afficherPositions(Joueur pirate1, Joueur pirate2) {
        System.out.println("Positions :");
        System.out.println(pirate1.getNom()
                + " [" + pirate1.getPion().getCouleur() + "]"
                + " | case : " + pirate1.getPion().getPosition()
                + "  | Coeurs : " + pirate1.getNbCoeurs());
        System.out.println(pirate2.getNom()
                + " [" + pirate2.getPion().getCouleur() + "]"
                + " | case : " + pirate2.getPion().getPosition()
                + "  | Coeurs : " + pirate2.getNbCoeurs());
        System.out.println();
    }

    @Override
    public void afficherCoeurs(Joueur joueur) {
        System.out.println(joueur.getNom() + " a maintenant " + joueur.getNbCoeurs() + " coeur(s).");
    }
    @Override
    public void afficherCaseSpeciale(Joueur joueur, String typeCase) {
        switch (typeCase) {
            case "Demi-Tour":
                System.out.println("CASE SPECIALE DEMI-TOUR !");
                System.out.println(joueur.getNom() + " doit reculer du même nombre de cases qu'il vient d'avancer !");
                break;
            case "Plus ou Moins":
                System.out.println("CASE SPECIALE PLUS OU MOINS !");
                System.out.println(joueur.getNom() + " lance 1 dé :");
                System.out.println("  - Résultat <= 3 : perd 1 coeur");
                System.out.println("  - Résultat >= 4 : gagne 1 coeur");
                break;
            default:
                System.out.println("CASE SPECIALE pour " + joueur.getNom());
                break;
        }
    }
    @Override
    public void afficherGagnant(Joueur gagnant) {
        System.out.println("VICTOIRE ! " + gagnant.getNom() + " remporte la partie !");
    }
}