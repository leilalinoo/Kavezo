package modell;

public class Forrocsoki extends Ital {

    private int cukorMenny;
    private int etcsokiMenny;
    private int tejcsokiMenny;

    public Forrocsoki() {
        this(0, 0, 0);
    }

    public Forrocsoki(int cukorMenny, int etcsokiMenny, int tejcsokiMenny) {
        this.cukorMenny = cukorMenny;
        this.etcsokiMenny = etcsokiMenny;
        this.tejcsokiMenny = tejcsokiMenny;
    }

    @Override
    public void novelCsoki(Csoki_IZESITES csokiizesites) {
        switch (csokiizesites) {
            case CUKOR:
                cukorMenny++;
                break;
            case ETCSOKI:
                etcsokiMenny++;
                break;
            case TEJCSOKI:
                tejcsokiMenny++;
                break;
            default:
                cukorMenny = 2;
                break;
        }
    }

    @Override
    public void kevesebbCsoki(Csoki_IZESITES csokiizesites) {
        switch (csokiizesites) {
            case CUKOR:
                cukorMenny--;
                break;
            case ETCSOKI:
                etcsokiMenny--;
                break;
            case TEJCSOKI:
                tejcsokiMenny--;
                break;
            default:
                cukorMenny = 2;
                break;
        }
    }

    @Override
    public void novel(IZESITES izesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebb(IZESITES izesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void novelMas(MAS_IZESITES masIzesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbMas(MAS_IZESITES masIzesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
