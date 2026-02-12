public class Pion {

	private String couleur;
	private int position;
	private int nbCase = 30;

	public Pion(String couleur) {
		this.couleur = couleur;
		this.position = 1;
	}

	public void deplacer(int valeur_de) {
		position += valeur_de;

		if (position > nbCase) {
			position = nbCase-(position-nbCase);
		}
	}

	public int getPosition() {
		return position;
	}

	public boolean aGagne() {
		boolean etat = false;
		if(position == nbCase) {
			etat = true;
		}
		return etat;
	}
}
