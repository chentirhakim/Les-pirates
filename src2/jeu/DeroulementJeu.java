package src2.jeu;

import java.util.Scanner;

public class DeroulementJeu {
    private Joueur pirate1;
    private Joueur pirate2;
    private Plateau plateau;
    private IAffichage affichage;

    public DeroulementJeu() {
        Pion p1 = new Pion(Couleur.ROUGE);
        Pion p2 = new Pion(Couleur.BLEU);
        pirate1 = new Joueur("Jack Le Borgne", p1);
        pirate2 = new Joueur("Bill Jambe De Bois", p2);
        plateau = new Plateau();
        plateau.initPlateau();
        affichage = new AffichageJeu();
    }

    public void lancerJeu() {
        Scanner scanner = new Scanner(System.in);
        int numTour = 1;

        while (pirate1.estEnVie() && pirate2.estEnVie()
                && pirate1.getPion().getPosition() < 30
                && pirate2.getPion().getPosition() < 30) {

            // --- Tour de pirate1 ---
            scanner.nextLine();
            affichage.afficherDebutTour(pirate1, numTour);
            jouerTour(pirate1);
            affichage.afficherPositions(pirate1, pirate2);

            if (!pirate2.estEnVie() || pirate1.getPion().getPosition() >= 30) {
                break;
            }

            // --- Tour de pirate2 ---
            scanner.nextLine();
            affichage.afficherDebutTour(pirate2, numTour);
            jouerTour(pirate2);
            affichage.afficherPositions(pirate1, pirate2);

            numTour++;
        }

        Joueur gagnant = determinerGagnant();
        affichage.afficherGagnant(gagnant);
        scanner.close();
    }

    private void jouerTour(Joueur joueur) {
        int valeurDes = joueur.lancerDe(2);
        affichage.afficherResultatsDes(joueur, valeurDes);

        joueur.deplacerPion(valeurDes);

        int positionActuelle = joueur.getPion().getPosition();
        Case caseActuelle = plateau.getCase(positionActuelle);

        if (caseActuelle instanceof DemiTour) {
            affichage.afficherCaseSpeciale(joueur, "Demi-Tour");
            DemiTour demiTour = (DemiTour) caseActuelle;
            demiTour.annulerTour(valeurDes, joueur.getPion());

        } else if (caseActuelle instanceof PlusOuMoins) {
            affichage.afficherCaseSpeciale(joueur, "Plus ou Moins");
            PlusOuMoins plusOuMoins = (PlusOuMoins) caseActuelle;
            plusOuMoins.modifierVie(joueur);
            affichage.afficherCoeurs(joueur);
        }
    }

    private Joueur determinerGagnant() {
        if (pirate1.getPion().getPosition() >= 30) {
            return pirate1;
        }
        if (pirate2.getPion().getPosition() >= 30) {
            return pirate2;
        }
        if (!pirate1.estEnVie()) {
            return pirate2;
        }
        return pirate1;
    }
}