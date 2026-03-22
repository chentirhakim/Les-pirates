package src2.jeu;

public abstract class Case {
    protected int numero;

    public Case(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}