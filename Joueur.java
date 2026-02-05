import java.security.SecureRandom;

public class Joueur {

	private Sting nom;
	private int nbcoeur = 5;
	private int Random random;

	public Joueur(String nom) {
		this.nom = nom;

	}

	try {
		random = SecureRandom.getInstanceStrong();
	} 
	catch( Exception e) {
		e.printStackTrace();
	}

	public int lanceDe() {
		return random.nextInt(2,13);
	}

}
