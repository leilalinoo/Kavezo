package modell;

enum KVIzesit {
    CUKOR, TEJ
}

enum TEAIzesites {
    CITROM, CUKOR
}

enum csokiIzesit {
    CUKOR,FEHERCSOKI, TEJCSOKI
}

public abstract class Ital {

    public abstract void KVizesit(KVIzesit kave);

    public abstract void TEAizesit(TEAIzesites tea);

    public abstract void CSOKIizesit(csokiIzesit csoki);

    public abstract void plusz();

    public abstract void kevesebb();
}
