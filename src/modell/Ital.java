package modell;

public abstract class Ital {
    int mennyiseg;
    int valasz;
     public int izesit(int valasz){
        switch (valasz) {
            case 1:
                novel();
                break;
            case 2:
                kevesebb();
                break;
            default:
                mennyiseg = 2;
                break;
        }
         
        return mennyiseg;
     }

    abstract public void novel();

    abstract public void kevesebb();
}
