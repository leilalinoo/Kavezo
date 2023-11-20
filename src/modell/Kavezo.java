
package modell;

public class Kavezo {
    int kvmennyiseg, teamennyiseg, f_csokimennyiseg;
    Kave k1 = new Kave();
    Tea t1 = new Tea();
    Forrocsoki f1 =new Forrocsoki();
    public Kavezo(int kvmennyiseg, int teamennyiseg, int f_csokimennyiseg) {
        this.kvmennyiseg = kvmennyiseg;
        this.teamennyiseg = teamennyiseg;
        this.f_csokimennyiseg = f_csokimennyiseg;
    }
    public void rendeles(Ital ital){
       elfogy(ital);
    
    };
   
    public void elfogy(Ital ital){
        if(ital.getClass() == k1.getClass()){
        kvmennyiseg--;
    }
    else if(ital.getClass() == t1.getClass()){
        teamennyiseg--;
    }
    else if(ital.getClass() == f1.getClass()){
        f_csokimennyiseg--;
    }
        
    }
}
