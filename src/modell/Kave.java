package modell;

    
  public class Kave extends Ital {
    int erosseg;
    int cmenny;
    int tejmenny;
    int tszinmenny;

    public Kave(int erosseg) {
        this(erosseg, 0, 0, 0);
    }

    public Kave(int erosseg, int cmenny, int tejmenny, int tszinmenny) {
        this.erosseg = erosseg;
        this.cmenny = cmenny;
        this.tejmenny = tejmenny;
        this.tszinmenny = tszinmenny;
    }

    public Kave() {
        this(0, 0, 0, 0);
    }
    
    public int getErosseg() {
        return erosseg;
    }

    public void setErosseg(int erosseg) {
        this.erosseg = erosseg;
    }

    
    
    @Override
    public void novel(IZESITES izesites) {
        switch (izesites) {
            case CUKOR:
                cmenny++;
                break;
            case TEJ:
                tejmenny++;
                break;
            case TEJSZIN:
                tszinmenny++;
                break;
            default:
                cmenny = 2;
                break;
        }
    }

    @Override
    public void kevesebb(IZESITES izesites) {
        switch (izesites) {
            case CUKOR:
                cmenny--;
                break;
            case TEJ:
                tejmenny--;
                break;
            case TEJSZIN:
                tszinmenny--;
                break;
            default:
                cmenny = 2;
                break;
        }
    
}

    @Override
    public void novelMas(MAS_IZESITES masIzesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbMas(MAS_IZESITES masIzesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    @Override
    public void novelCsoki(Csoki_IZESITES csokiizesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbCsoki(Csoki_IZESITES csokiizesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  }