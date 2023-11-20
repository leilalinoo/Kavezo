package modell;

public class Kave extends Ital{

    private int cukorm;
    private int tejm;
    private int tejszinm;
    
    public Kave(int cukorm, int tejm, int tejszinm) {
        this.cukorm = cukorm;
        this.tejm = tejm;
        this.tejszinm = tejszinm;
    }
    
    @Override
    public void plusz(IZ cucc) {
        switch (cucc) {
            case CUKOR:
                cukorm++;
                break;
            case TEJ:
                tejm++;
                break;
            case TEJSZIN:
                tejszinm++;
                break;
            default:
                throw new AssertionError();
        }
    }


    @Override
    public void kevesebb(IZ cucc) {
       switch (cucc) {
            case CUKOR:
                cukorm--;
                break;
            case TEJ:
                tejm--;
                break;
            case TEJSZIN:
                tejszinm--;
                break;
            default:
                throw new AssertionError();
        }
    }

    public void pluszTEA(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pluszcsoki(DISZEK cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pluszTEA(IZ2 cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbtea(IZ2 cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbcsoki(DISZEK cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
