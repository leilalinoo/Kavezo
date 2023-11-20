
package nezet;

import java.awt.BorderLayout;
import java.util.Scanner;
import modell.Kavezo;


public class KaveView {
    
    public void KaveView(){
      String ital = rendelesFelvesz();
    
    }
    Kavezo Starbucks = new Kavezo(5,4,3);
    Scanner sc = new Scanner(System.in);

    
    public String rendelesFelvesz(){
    System.out.println("Mit szeretne inni? {Kave, Tea, Forrocsoki}");
    String  valasztas = sc.nextLine();
    return valasztas;
    }
    
}
