public class Test_Joueur {

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Luffy");
        Joueur joueur2 = new Joueur("Zoro");
        
        Pion pion1 = new Pion("Luffy");
        Pion pion2 = new Pion("Zoro");

        while(pion1.aGagne() != true & pion2.aGagne() != true) {
	        int valeur = joueur1.lanceDe();
	        System.out.println("Résultat du lancer : " + valeur);
	        int valeur2 = joueur2.lanceDe();
	        System.out.println("Résultat du lancer : " + valeur2);
	
	        pion1.deplacer(valeur);
	        System.out.println("Nouvelle position du pion1 : " + pion1.getPosition());
	        pion2.deplacer(valeur2);
	        System.out.println("Nouvelle position du pion2 : " + pion2.getPosition());
	        
	        if(pion1.aGagne() == true) {
	        	System.out.println("Le pion 1 a gagné");
	        }
	        if(pion2.aGagne() == true) {
	        	System.out.println("Le pion 2 a gagné");
	        }
	        
        }
    }
}
