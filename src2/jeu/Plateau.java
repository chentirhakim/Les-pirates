package src.jeu;

public class Plateau {
    private Case[] tabCases;

    public Plateau() {
        tabCases = new Case[30];
    }

//	Initialise le plateau avec les cases normales et les cases spéciales.
//	Cases DemiTour : 7, 14, 21
//	Cases PlusOuMoins : 5, 10, 17, 25
    
    public void initPlateau() {
        for (int i = 1; i <= 30; i++) {
            if (i == 7 || i == 14 || i == 21) {
                tabCases[i - 1] = new DemiTour(i);
            } else if (i == 5 || i == 10 || i == 17 || i == 25) {
                tabCases[i - 1] = new PlusOuMoins(i);
            } else {
                tabCases[i - 1] = new CaseNormale(i);
            }
        }
    }
    public Case getCase(int numero) {
        if (numero < 1 || numero > 30) {
            return null;
        }
        return tabCases[numero - 1];
    }
}