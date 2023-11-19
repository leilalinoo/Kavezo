package modell;
public abstract class Ital {

    public enum IZESITES {
        CUKOR, TEJ, TEJSZIN
    }

    public enum MAS_IZESITES {
        CITROM, KARAMEL,CUKOR
    }

    abstract public void novel(IZESITES izesites);

    abstract public void kevesebb(IZESITES izesites);

    abstract public void novelMas(MAS_IZESITES masIzesites);

    abstract public void kevesebbMas(MAS_IZESITES masIzesites);
}
