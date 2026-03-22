package src.jeu;

public class DemiTour extends Case {

    public DemiTour(int numero) {
        super(numero);
    }
    public void annulerTour(int distanceDeplacement, Pion pion) {
        pion.deplacer(-distanceDeplacement);
    }
}