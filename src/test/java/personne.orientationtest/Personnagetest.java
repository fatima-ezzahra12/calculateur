package personne.orientationtest;
import org.junit.jupiter.api.Test;
import personne.orientation.Personnage;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Personnagetest {
    @Test
    void tourn_test0(){
        Personnage p=new Personnage();
        String r=p.tourner(0);
        assertEquals("NORD",r,"we be "+"NORD"+" but we "+r);
    }
    @Test
    void tourn_test1(){
        Personnage P= new Personnage();
        String result=P.tourner(1);
        assertEquals("EST",result,"we be "+"EST"+" but we "+result);
    }


}
