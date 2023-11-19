package modell;

public abstract class Ital {

    public enum IZESITES {
        CUKOR, TEJ, TEJSZIN
    }

    public enum MAS_IZESITES {
        CITROM, KARAMEL, CUKOR
    }

    public enum Csoki_IZESITES {
        CUKOR, ETCSOKI, TEJCSOKI
    }

    abstract public void novel(IZESITES izesites);

    abstract public void kevesebb(IZESITES izesites);

    abstract public void novelMas(MAS_IZESITES masIzesites);

    abstract public void kevesebbMas(MAS_IZESITES masIzesites);

    abstract public void novelCsoki(Csoki_IZESITES csokiizesites);

    abstract public void kevesebbCsoki(Csoki_IZESITES csokiizesites);
}
