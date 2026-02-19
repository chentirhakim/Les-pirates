public class Jeu {

    public static void main(String[] args) {

        Plateau plateau = new Plateau(30);

        Joueur joueur1 = new Joueur("Jack Le Borne", "Rouge");
        Joueur joueur2 = new Joueur("Bill Jambe de Bois", "Bleu");

        Joueur[] joueurs = { joueur1, joueur2 };
        int tour = 0;

        while (joueurs[0].estVivant() && joueurs[1].estVivant()) {

            Joueur joueurCourant = joueurs[tour % 2];

            System.out.println("\nTour de " + joueurCourant.getNom());

            int valeur = joueurCourant.lancerDes();
            System.out.println("Résultat des dés : " + valeur);

            joueurCourant.getPion().deplacer(valeur, plateau.getNbCases());
            System.out.println("Position : " + joueurCourant.getPion().getPosition());

            if (joueurCourant.getPion().aGagne(plateau.getNbCases())) {
                System.out.println(joueurCourant.getNom() + " a gagné !");
                break;
            }

            tour++;
        }
    }
}
