package jeu;

import java.security.SecureRandom;

public class Joueur {

	private String nom;
	private int nbcoeur = 5;
	private SecureRandom Random ;

	public Joueur(String nom) {
		this.nom = nom;



	try {
		Random = SecureRandom.getInstanceStrong();
	} 
	catch( Exception e) {
		e.printStackTrace();
	}

	public int lanceDe() {
		return Random.nextInt(2,13);
	}

}
