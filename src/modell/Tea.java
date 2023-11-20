package modell;

public class Tea extends Ital{
   // private int ho;
    private int cukorm;
    private int citromm;
    
    Tea(){
        this.cukorm = 2;
        this.citromm = 1;
    }

    public void pluszTEA(IZ2 izek) {
        switch (izek) {
            case CUKOR:
                cukorm++;
                break;
            case CITROM:
                citromm++;
                break;
            
            default:
                throw new AssertionError();
        }
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

    public void pluszcsoki(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pluszcsoki(DISZEK cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebb(IZ cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbtea(IZ2 cucc) {
        switch (cucc) {
            case CUKOR:
                cukorm--;
                break;
            case CITROM:
                citromm--;
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void kevesebbcsoki(DISZEK cucc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
