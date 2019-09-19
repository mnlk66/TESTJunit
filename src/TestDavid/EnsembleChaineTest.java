package TestDavid;

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
        //Test1
        EnsembleChaine ex = new EnsembleChaine();
        EnsembleChaine ex1 = new EnsembleChaine();
        String tablo[] = {"fruit","legumes"};
        String tablu[] = {"fruit","legumes"};

        ex.ajouter(tablo);
        ex1.ajouter(tablu);

        assertTrue("verification de la egalité des deux chaines",ex.equals(ex1));
        ex.liste.clear();
        ex1.liste.clear();


        //Test2
        EnsembleChaine ec1 = new EnsembleChaine();
        EnsembleChaine ec2 = new EnsembleChaine();
        String tableau[]={"pain"};
        String tableau2[]={"pain", "beurre"};
        assertTrue("un seul element commun",ec1.equals(ec2));
        ec1.liste.clear();
        ec2.liste.clear();


        //Test3
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


            assertTrue("vérification de la chaine attendu",e1.union(e2).equals(e3));

            e1.liste.clear();
            e2.liste.clear();
            e3.liste.clear();


            //Test2
        EnsembleChaine e4 = new EnsembleChaine();
        EnsembleChaine e5 = new EnsembleChaine();
        String tab4[] = {"camion","chien","poisson"};
        String tab5[] = {"avion","poisson"};
        e4.ajouter(tab4);
        e5.ajouter(tab5);


        EnsembleChaine e6=new EnsembleChaine();
        String tab6[] ={"camion","chien","poisson","avion"};
        e6.ajouter(tab6);


        assertTrue("vérification de la chaine attendu",e4.union(e5).equals(e6));

        e4.liste.clear();
        e5.liste.clear();
        e6.liste.clear();

    }

    @Test
    public void testIntersection(){
        //Test1
        EnsembleChaine e1 = new EnsembleChaine();
        EnsembleChaine e2 = new EnsembleChaine();
        String tab1[] = {"camion","chien","poisson","hareng-saur"};
        String tab2[] = {"avion","poisson","poule","hareng-saur"};
        e1.ajouter(tab1);
        e2.ajouter(tab2);

        EnsembleChaine e3 = new EnsembleChaine();
        String tab3[] = {"poisson","hareng-saur"};
        e3.ajouter(tab3);

        assertTrue("vérification de l'intersection",e1.intersection(e2).equals(e3));

        e1.liste.clear();
        e2.liste.clear();
        e3.liste.clear();



        //Test2
        EnsembleChaine cam = new EnsembleChaine();
        EnsembleChaine cam2 = new EnsembleChaine();
        String taba[] = {"a","b"};
        String tabo[] = {"c","d"};

        cam.ajouter(taba);
        cam2.ajouter(tabo);

        EnsembleChaine cam3 = new EnsembleChaine();
        String tabu[] = {};
        cam3.ajouter(tabu);

        assertTrue("verification d'aucune intersection",cam.intersection(cam2).equals(cam3));

        cam.liste.clear();
        cam2.liste.clear();
        cam3.liste.clear();


        //Tes3 chaine vide
        EnsembleChaine ec = new EnsembleChaine();
        EnsembleChaine ec2= new EnsembleChaine();
        String tableau[] = {};
        String tableau2[]= {};
        ec.ajouter(tableau);
        ec2.ajouter(tableau2);

        EnsembleChaine ec3= new EnsembleChaine();
        String tableau3[]={};
        ec3.ajouter(tableau3);

        assertTrue("pas d'union détecter",ec.union(ec2).equals(ec3));

    }


    @Test
    public void testUnionDisjointe(){
        EnsembleChaine e1 = new EnsembleChaine();
        EnsembleChaine e2 = new EnsembleChaine();
        String tableau[]={"pain","jambon","fromage"};
        String tableau2[]={"pain","beurre","hareng-saur"};
        e1.ajouter(tableau);
        e2.ajouter(tableau2);

        EnsembleChaine e3 = new EnsembleChaine();
        String tableau3[]={"jambon","fromage","beurre","hareng-saur"};
        e3.ajouter(tableau3);

        assertTrue("ce qu'il n'y a pas en commum",e1.unionDisjointe(e2).equals(e3));
        e1.liste.clear();
        e2.liste.clear();
        e3.liste.clear();

    }

}
