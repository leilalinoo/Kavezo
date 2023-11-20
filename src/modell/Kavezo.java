package modell;

public class Kavezo {

    int kvrend, tearend, csokirend;
    Kave kv = new Kave();
    Tea tea = new Tea();
    Forro_csoki csoki = new Forro_csoki();

    public Kavezo(int kvrend, int tearend, int csokirend) {
        this.kvrend = kvrend;
        this.tearend = tearend;
        this.csokirend = csokirend;
    }

    public void rendeles(Ital ital) {
      

    }

    public void efogy(Ital ital) {
        if (ital.getClass() == kv.getClass()) {
            kvrend--;
        } else if (ital.getClass() == tea.getClass()) {
            tearend--;
        } else if (ital.getClass() == csoki.getClass()) {
            csokirend--;
        }
    }
}
