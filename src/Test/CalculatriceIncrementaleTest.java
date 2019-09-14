package Test;


import Main.CalculatriceIncrementale;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CalculatriceIncrementaleTest {

    private CalculatriceIncrementale calc;

    @Test
    public void testAjouter(){

        calc = new CalculatriceIncrementale();

        assertTrue(calc.ajouter(5,2)==7);

        assertTrue(calc.ajouter(0,2)==2);

        assertTrue(calc.ajouter(0,-2)==-2);

        assertTrue(calc.ajouter(-4,0)==-4);



        assertTrue(calc.ajouter(-5,2)==-3);


        assertTrue("addition de deux négatifs",calc.ajouter(-5,-2)==-7);




    }
    @Test
    public void testSoustraire(){

        calc = new CalculatriceIncrementale();

        assertTrue(calc.soustraire(5,2)==3);


        assertTrue(calc.soustraire(-5,4)==-9);


        assertTrue("soustraction d'un nombre negatif",calc.soustraire(0,-2)==2);


        assertTrue("addition de deux négatifs",calc.soustraire(-4,0)==-4);

        assertTrue(calc.soustraire(-5,-2)== -3);


    }
    @Test
    public void testMultiplier(){
        calc = new CalculatriceIncrementale();

        assertTrue("multiplication de deux positifs", calc.multiplier(5,2)==10);

        assertTrue("multiplication d'un positif avec un negatif",calc.multiplier(5,-2)==-10);


        assertTrue("soustraction d'un nombre negatif",calc.multiplier(0,1)==0);


        assertTrue("addition de deux négatifs",calc.multiplier(2,0)==0);


        assertTrue(calc.multiplier(3,-2)== -6);

        assertTrue("multiplication d'un negatif par un positif",calc.multiplier(-5,3)==-15);




    }

    @Test
    public void testDivision(){
        calc = new CalculatriceIncrementale();

        assertTrue("multiplication de deux positifs",calc.diviser(10,2)==5);

        assertTrue("multiplication de deux positifs",calc.diviser(2,3)==2/3);


        assertTrue("soustraction d'un nombre negatif",calc.diviser(-2,3)==-2/3);


        assertTrue("addition de deux négatifs",calc.diviser(3,-2)==-3/2);




    }
}
