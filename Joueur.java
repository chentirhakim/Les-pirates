import java.security.SecureRandom;

public class Joueur {

    private String nom;
    private int nbCoeur;
    private SecureRandom random;

    public Joueur(String nom) {
        this.nom = nom;
        this.nbCoeur = 5;

        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int lanceDe() {
        return random.nextInt(11) + 2;
    }

    public String getNom() {
        return nom;
    }

    public int getNbCoeur() {
        return nbCoeur;
    }
}
