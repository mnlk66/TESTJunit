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
        assertTrue("si la liste contient un element particulier",e1.liste.contains("e"));

        String tab4[]={"a,b,c","j,k,o","p,o,m"};
        e1.ajouter(tab4);
        assertTrue("si la liste contient plusieurs elements",e1.liste.contains("e,h,y"));

        String tab5[]={""};
        e1.ajouter(tab5);
        assertTrue("si la liste est vide",e1.liste.contains("a"));


    }

    @Test
    public void testEquals(){
        EnsembleChaine ex = new EnsembleChaine();
    }


    @Test
    public void testUnion(){
        EnsembleChaine e2 = new EnsembleChaine();
        String tab1[] = {"a,z,e"};
        String tab2[] = {"i,k,n"};

        e2.ajouter(tab1);
        assertTrue("si la liste possède les elements suivants",e2.liste.contains(("a,z,f")));
    }

    @Test
    public void testIntersection(){
        EnsembleChaine e3 = new EnsembleChaine();
        String tab2[] = {"a,t,y"};
        e3.ajouter(tab2);
        assertTrue("vérifer l'intersection", e3.liste.contains("z,f,g"));

        String tab3[] = {"a,t,i"};
        e3.ajouter(tab2);
        assertTrue("il n'y a pas d'intersection", e3.liste.contains("o,p,s"));

        String tab4[] = {"a,q,w","z,s,x"};
        e3.ajouter(tab4);
        assertTrue("verifier les intersections dans deux tableau", e3.liste.contains("q,w,x"));





    }

}
