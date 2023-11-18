package modell;

public class Forro_Csoki extends Ital {
    
    //forró_csoki: díszítés, fajta
    public enum DISZEK {SEMMI, CSOKISZORAS, TEJSZINHAB, KARAMELL, MOGYORO};
    public enum FAJTA {FEHÉRCSOKI, MOGYORÓ, BASIC, BANÁN};
    private DISZEK disz;
    private FAJTA fajta;
    
    Forro_Csoki(FAJTA fajta, DISZEK disz) {
        this.fajta = fajta;
        this.disz = disz;
    }
    
    @Override
    public void plusz() {
        
    }

    @Override
    public void kevesebb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
