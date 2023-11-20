package modell;

abstract public class Ital {

    int mennyiseg;
    boolean valasztas;
    enum IZ {CUKOR, TEJ, TEJSZIN};
    enum IZ2 {CUKOR, CITROM};
    public enum DISZEK {SEMMI, CSOKISZORAS, TEJSZINHAB, KARAMELL, MOGYORO};

    Ital() {
        mennyiseg = 2;
    }

   /* public int izesit(int valasztas) {
        switch (valasztas) {
            case 1 -> plusz();
            case 2 -> kevesebb();
            default -> mennyiseg = 2;
        }
        return mennyiseg;
    }*/

    abstract public void plusz(IZ cucc);
    abstract public void pluszTEA(IZ2 cucc);
    abstract public void pluszcsoki(DISZEK cucc);

    abstract public void kevesebb(IZ cucc);
    abstract public void kevesebbtea(IZ2 cucc);
    abstract public void kevesebbcsoki(DISZEK cucc);

}
