package src.jeu;

import java.security.SecureRandom;

public class De {
    private SecureRandom random;

    public De() {
        this.random = new SecureRandom();
    }
    public int lancer(int nbDes) {
        int total = 0;
        for (int i = 0; i < nbDes; i++) {
            total += random.nextInt(6) + 1;
        }
        return total;
    }
}