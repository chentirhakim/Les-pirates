package jeu;

public class Pion {
    private Couleur couleur;
    private int position;

    public Pion(Couleur couleur) { ... }

    public void deplacer(int nb_cases) {
        position += nb_cases;
    }

    public int getPosition() { 
    	return position; 
    	}
    public Couleur getCouleur() { 
    	return couleur; 
    	}
}
