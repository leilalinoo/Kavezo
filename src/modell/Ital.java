package modell;

abstract public class Ital {

    int mennyiseg;
    boolean valasztas;

    Ital() {
        mennyiseg = 2;
    }

    public int izesit(int valasztas) {
        if(valasztas == 1){
            plusz();
        }else if(valasztas == 2){
            kevesebb();
        }else{
            mennyiseg = 2;
        }
        return mennyiseg;
    }

    abstract public void plusz();

    abstract public void kevesebb();

}
