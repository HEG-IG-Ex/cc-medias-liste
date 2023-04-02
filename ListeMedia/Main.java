import dao.Bdd;
import domaine.Media;
import domaine.Telechargeable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Telechargeable> catalogue = Bdd.GetMediaCatalogue();
        
        for (Telechargeable m: catalogue){
            if(m.checkEligibility()){
                System.out.println(m);
            }
        }

        for (Telechargeable m: catalogue){
            if(!m.checkEligibility()){
                System.out.println(m);
            }
        }
        
    }
}