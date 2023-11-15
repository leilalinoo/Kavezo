package modell;

public class Kave extends Ital {
    private int cukor;
    private int erosseg;

    public Kave(int erosseg) {
        this.erosseg = erosseg;
    }

    public int getErosseg() {
        return erosseg;
    }

    public void setErosseg(int erosseg) {
        this.erosseg = erosseg;
    }

    public int getCukor() {
        return cukor;
    }

    @Override
    public void izesit() {
    }

    @Override
    public void plusz() {
    }

    @Override
    public void kevesebb() {
    }

}
