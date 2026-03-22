package src.jeu;

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
// Cases spéciales à préciser "fonctionnement"
    @Override
    public void afficherCaseSpeciale(Joueur joueur, String typeCase) {
        System.out.println("-> CASE SPECIALE [" + typeCase + "] pour " + joueur.getNom() + " !");
    }

    @Override
    public void afficherGagnant(Joueur gagnant) {
        System.out.println("VICTOIRE ! " + gagnant.getNom() + " remporte la partie !");
    }
}