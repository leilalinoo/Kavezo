package modell;

abstract public class Ital {

    int mennyiseg;
    boolean valasztas;

    Ital() {
        mennyiseg = 2;
    }

    public int izesit(int valasztas) {
        switch (valasztas) {
            case 1 -> plusz();
            case 2 -> kevesebb();
            default -> mennyiseg = 2;
        }
        return mennyiseg;
    }

    abstract public void plusz();

    abstract public void kevesebb();

}
