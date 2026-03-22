package src2.jeu;

public class PlusOuMoins extends Case {

    public PlusOuMoins(int numero) {
        super(numero);
    }

    public void modifierVie(Joueur pirate) {
        int valeurDe = pirate.lancerDe(1);
        if (valeurDe <= 3) {
            pirate.enleverVie(1);
        } else {
            pirate.ajouterVie(1);
        }
    }
}