package modell;

import static modell.KVIzesit.CUKOR;
import static modell.KVIzesit.TEJ;

public class Kave extends Ital {

    private int cukor;
    private int erosseg;
    private int tej;

    public Kave(int erosseg) {
        this(erosseg, 0, 0, 0);
    }

    public Kave(int erosseg, int cukor, int tej) {
        this.erosseg = erosseg;
        this.cukor = cukor;
        this.tej= tej;
        
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

    public int getCukor() {
        return cukor;
    }

   

   
    public void kevesebb(KVIzesit kave) {
         switch (kave) {
            case CUKOR:
                cukor--;
                break;
            case TEJ:
                tej--;
                break;
            default:
                cukor = 2;
                break;
    }

}

    @Override
    public void KVizesit(KVIzesit kave) {
        switch (kave) {
            case CUKOR:
                cukor++;
                break;
            case TEJ:
                tej++;
                break;

            default:
                cukor = 2;
                break;
        }
    }

    @Override
    public void TEAizesit(TEAIzesites tea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CSOKIizesit(csokiIzesit csoki) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebb() {
    }

    @Override
    public void plusz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
