package src2.jeu;

import java.security.SecureRandom;

public class Joueur {
    private String nom;
    private int nbCoeurs;
    private Pion pion;
    private SecureRandom random;

    public Joueur(String nom, Pion pion) {
        this.nom = nom;
        this.pion = pion;
        this.nbCoeurs = 5;
        this.random = new SecureRandom();
    }

    public void deplacerPion(int nbCases) {
        pion.deplacer(nbCases);
    }

    public boolean estEnVie() {
        return nbCoeurs > 0;
    }

    public void enleverVie(int coeurs) {
        nbCoeurs -= coeurs;
        if (nbCoeurs < 0) {
            nbCoeurs = 0;
        }
    }

    public void ajouterVie(int coeurs) {
        nbCoeurs += coeurs;
        if (nbCoeurs > 5) {
            nbCoeurs = 5;
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNbCoeurs() {
        return nbCoeurs;
    }

    public int lancerDe(int nombreDe) {
        int total = 0;
        for (int i = 0; i < nombreDe; i++) {
            total += random.nextInt(6) + 1;
        }
        return total;
    }

    public Pion getPion() {
        return pion;
    }
}