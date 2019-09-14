package Test;

import Main.EnsembleChaine;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class EnsembleChaineTest {
    @Test

    public void testAjouter(){
        EnsembleChaine e1 = new EnsembleChaine();
        String tab[] ={"a,b,c"};
        e1.ajouter(tab);
        assertTrue("ajout de 2 chaînes de caractère ayant des valeurs communes",e1.liste.size() == 1 && e1.liste.contains("a,b,c"));

        String tab2[]={"a,b,c","c,d,e","e,f,g"};
        e1.ajouter(tab2);
        assertTrue("test 2",e1.liste.size()==2 && e1.liste.contains("a,b,c") && e1.liste.contains("c,d,e"));

        String tab3[]={"a,b,c","c,d,e"};
        e1.ajouter(tab3);
        assertTrue("si la liste contient un element particulie",e1.liste.contains("e"));

        String tab4[]={"a,b,c","j,k,o","p,o,m"};
        e1.ajouter(tab4);
        assertTrue("si la liste contiient plusieurs elements",e1.liste.contains("e,h,y"));



    }


}
