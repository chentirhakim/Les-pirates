package src2.jeu;

public interface IAffichage {
    void afficherGagnant(Joueur gagnant);
    void afficherResultatsDes(Joueur joueur, int valeurDes);
    void afficherPositions(Joueur pirate1, Joueur pirate2);
    void afficherCoeurs(Joueur joueur);
    void afficherCaseSpeciale(Joueur joueur, String typeCase);
    void afficherDebutTour(Joueur joueur, int numTour);
}