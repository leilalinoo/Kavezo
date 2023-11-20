package modell;

public class Forro_Csoki extends Ital {

    
    public enum FAJTA {FEHÉRCSOKI, MOGYORÓ, BASIC, BANÁN};
    private DISZEK disz;
    private int diszm;
    private FAJTA fajta;
    
    Forro_Csoki(FAJTA fajta, DISZEK disz) {
        this.fajta = fajta;
        this.disz = disz;
        this.diszm = 1;
    }
    
    @Override
    public void pluszcsoki(DISZEK cucc) {
        switch (cucc) {
            case CSOKISZORAS:
                diszm++;
                break;
            case TEJSZINHAB:
                diszm++;
                break;
            case MOGYORO:
                diszm++;
                break;
            case KARAMELL:
                diszm++;
                break;
            default:
                diszm=1;
        }
    }
    
    @Override
    public void kevesebbcsoki(DISZEK cucc) {
        diszm--;
    }
    
    public void kevesebb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        @Override
    public void plusz(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pluszTEA(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        @Override
    public void pluszTEA(IZ2 cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebb(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbtea(IZ2 cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
