
package modell;


public class Tea extends Ital {

    int citromMenny;
    int karamelMenny;

    

    @Override
    public void novelMas(MAS_IZESITES masIzesites) {
        switch (masIzesites) {
            case CITROM:
                citromMenny++;
                break;
            case KARAMEL:
                karamelMenny++;
                break;
            default:
                citromMenny++;
                break;
        }
    }

    @Override
    public void kevesebbMas(MAS_IZESITES masIzesites) {
        switch (masIzesites) {
            case CITROM:
                citromMenny--;
                break;
            case KARAMEL:
                karamelMenny--;
                break;
            default:
                citromMenny--;
                break;
        }
    }

    @Override
    public void novelCsoki(Csoki_IZESITES csokiizesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void kevesebbCsoki(Csoki_IZESITES csokiizesites) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void novel(IZESITES izesites) {
        // Implementáció
    }

    @Override
    public void kevesebb(IZESITES izesites) {
        // Implementáció
    }
}
