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
        e1.liste.clear();


        String tab2[]={"a,b,c","c,d,e","e,f,g"};
        e1.ajouter(tab2);
        assertTrue("test 2",e1.liste.size()==3 && e1.liste.contains("a,b,c") && e1.liste.contains("c,d,e") && e1.liste.contains("e,f,g"));
        e1.liste.clear();


        String tab3[]={"a,b,c","c,d,e"};
        e1.ajouter(tab3);
        assertTrue("si la liste contient un element particulier",e1.liste.size()==2 && e1.liste.contains("c,d,e"));
        e1.liste.clear();


        String tab4[]={"a,b,c","j,k,o","p,o,m"};
        e1.ajouter(tab4);
        assertTrue("si la liste contient plusieurs elements",e1.liste.contains("p,o,m"));
        e1.liste.clear();


        String tab5[]={};
        e1.ajouter(tab4);
        e1.ajouter(tab5);
        assertTrue("si la liste est vide",e1.liste.size()==3);
        e1.liste.clear();

        //tab null



    }

    @Test
    public void testEquals(){
        EnsembleChaine ex = new EnsembleChaine();
    }


    @Test
    public void testUnion(){
            //Test1
            EnsembleChaine e1 = new EnsembleChaine();
            EnsembleChaine e2 = new EnsembleChaine();
            String tab1[] = {"camion","chien","poisson"};
            String tab2[] = {"avion","chien","poisson"};
            e1.ajouter(tab1);
            e2.ajouter(tab2);


            EnsembleChaine e3=new EnsembleChaine();
            String tab3[] ={"camion","chien","poisson","avion"};
            e3.ajouter(tab3);


            assertTrue("vérification de la bonne chaine de caractere",e1.union(e2).equals(e3));

            e1.liste.clear();
            e2.liste.clear();
            e3.liste.clear();

    }

    @Test
    public void testIntersection(){
        EnsembleChaine e3 = new EnsembleChaine();

        String tab2[] = {"a,b,c","c,d,e"};
        e3.ajouter(tab2);

        assertTrue("vérifer l'intersection", e3.liste.contains("c"));
        e3.liste.clear();


        String tab3[] = {"a,t,i","a,t,m"};
        e3.ajouter(tab3);
        assertTrue("il n'y a pas d'intersection", e3.liste.contains("o,p,s"));
        e3.liste.clear();


        String tab4[] = {"a,q,w","z,s,x"};
        e3.ajouter(tab4);
        assertTrue("verifier les intersections dans deux tableau", e3.liste.contains("q,w,x"));
        e3.liste.clear();






    }

}
