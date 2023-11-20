package modell;

import static modell.TEAIzesites.CITROM;
import static modell.TEAIzesites.CUKOR;

public class Tea extends Ital {

    private int homerseklet, citrom, cukor;

    public Tea(int homerseklet) {
        this(50,0,0);
    }

    public Tea(int homerseklet, int citrom, int cukor) {
        this(homerseklet);
        this.citrom = citrom;
        this.cukor = cukor;
    }

    public Tea() {
         this(0, 0, 0, 0);
    }
    
    

    public int getHomerseklet() {
        return homerseklet;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }

    
  
    public void kevesebb(TEAIzesites tea) {
        switch (tea) {
            case CUKOR:
                cukor++;
                break;
            case CITROM:
                citrom++;
                break;

            default:
                cukor = 2;
                citrom = 1;
        }
    }

    @Override
    public void KVizesit(KVIzesit kave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void TEAizesit(TEAIzesites tea) {
        switch (tea) {
            case CUKOR:
                cukor++;
                break;
            case CITROM:
                citrom++;
                break;

            default:
                cukor = 2;
                citrom = 1;
        }
    }

    @Override
    public void CSOKIizesit(csokiIzesit csoki) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void plusz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
