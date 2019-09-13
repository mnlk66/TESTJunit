package Test;

import Main.CalculatriceIncrementale;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


        assertTrue(calc.ajouter(-5,-2)==-7, "addition de deux négatifs");




    }
    @Test
    public void testSoustraire(){

        calc = new CalculatriceIncrementale();

        assertTrue(calc.soustraire(5,2)==3);


        assertTrue(calc.soustraire(-5,4)==-9);





        assertTrue(calc.soustraire(0,-2)==2, "soustraction d'un nombre negatif");


        assertTrue(calc.soustraire(-4,0)==-4, "addition de deux négatifs");
        assertTrue(calc.soustraire(-5,-2)== -3);


    }
    @Test
    public void testMultiplier(){
        calc = new CalculatriceIncrementale();

        assertTrue(calc.multiplier(5,2)==10,"multiplication de deux positifs");

        assertTrue(calc.multiplier(5,-2)==-10,"multiplication d'un positif avec un negatif");


        assertTrue(calc.multiplier(0,1)==0, "soustraction d'un nombre negatif");


        assertTrue(calc.multiplier(2,0)==0, "addition de deux négatifs");


        assertTrue(calc.multiplier(3,-2)== -6);

        assertTrue(calc.multiplier(-5,3)==-15,"multiplication d'un negatif par un positif");




    }

    @Test
    public void testDivision(){
        calc = new CalculatriceIncrementale();

        assertTrue(calc.diviser(10,2)==5,"multiplication de deux positifs");

        assertTrue(calc.diviser(2,3)==2/3,"multiplication de deux positifs");


        assertTrue(calc.diviser(-2,3)==-2/3, "soustraction d'un nombre negatif");


        assertTrue(calc.diviser(3,-2)==-3/2, "addition de deux négatifs");




    }
}
