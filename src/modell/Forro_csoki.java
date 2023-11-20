
package modell;

public class Forro_csoki extends Ital {
    private int cukor,tejcsoki,tej;
    
    public void izesit() {
    }

    @Override
    public void plusz() {
  }
     public Forro_csoki() {
        this(0, 0, 0);
    }

    public Forro_csoki(int cukor, int tejcsoki, int tej) {
        this.cukor = cukor;
        this.tejcsoki = tejcsoki;
        this.tej = tej;
    }

  
    public void kevesebb(csokiIzesit csoki) {
        switch (csoki) {
            case CUKOR:
                cukor--;
                break;
            case TEJCSOKI:
                tejcsoki--;
                break;
            default:
                cukor = 2;
                break;
        }
    }

    @Override
    public void KVizesit(KVIzesit kave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void TEAizesit(TEAIzesites tea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CSOKIizesit(csokiIzesit csoki) {
        switch (csoki) {
            case CUKOR:
                cukor++;
                break;
            case TEJCSOKI:
                tejcsoki++;
                break;
            default:
                cukor = 2;
                break;
        }
    }

    @Override
    public void kevesebb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
