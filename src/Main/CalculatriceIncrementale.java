package Main;

public class CalculatriceIncrementale {

    //Ajouter
    public int ajouter(int a, int b) {


        if (b > 0) {
            for (int i = 0; i < b; i++) {

                if (b > 0) {
                    a++;
                } else {
                    a--;
                }
            }
        } else {

            for (int j = 0; j > b; j--) {

                a--;
            }

        }
        return a;
    }

    //Soustraire
    public int soustraire(int a, int b) {
        if (b > 0) {


            for (int i = 0; i < b; i++) {
                if (b > 0) {
                    a--;
                } else {
                    a++;
                }
            }

        }

        else {

            for (int j = 0 ; j>b;j--){

                a++;
            }

        }
        return a;
    }

    //Multiplier
    public int multiplier(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        int res = a;
        for (int i = 1; i < b; i++) {
            for (int j = 0; j < a; j++) {
                res++;
            }
        }
        return res;
    }

    //Diviser
    public int diviser(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;
        while (a >= b) {
            for (int i = 0; i < b; i++) {
                a--;
            }
            res = res++;
        }
        return res;
    }

}
