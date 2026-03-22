package src2.jeu;

public class Pion {
    private Couleur couleur;
    private int position;

    public Pion(Couleur couleur) {
        this.couleur = couleur;
        this.position = 0;
    }

    public void deplacer(int nbCases) {
        position += nbCases;
        if (position < 1) {
            position = 1;
        }
        if (position > 30) {
            int depassement = position - 30;
            position = 30 - depassement;
        }
    }

    public int getPosition() {
        return position;
    }

    public Couleur getCouleur() {
        return couleur;
    }
}