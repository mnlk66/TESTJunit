package Main;

import java.util.ArrayList;

public class EnsembleChaine {

    public ArrayList< String > liste;
    public EnsembleChaine(){
        liste = new ArrayList<String>() ;
    }
    //Ajoute chaque chaine de tab, si elle n’existe pas déjà, à l’ensemble
    public void ajouter(String[] tab) {

        for (int i = 0 ; i < tab.length; i++) {

            if (!this.liste.contains(tab[i])){

                this.liste.add(tab[i]);
            }
        }


    }
    //Test si l’ensemble e est équivalent à l’ensemble courant
    public boolean equals(EnsembleChaine e) {

        boolean resultat=false;

        for(String n : e.liste) {

            if(this.liste.contains(n))
                resultat = true;

            else resultat = false;

        }


        return resultat;
    }
    //Renvoie l’union de l’ensemble e et l’ensemble courant
    public EnsembleChaine union(EnsembleChaine e){

        EnsembleChaine tmpunion = new EnsembleChaine();

        String[] tab = new String[500];
        String[] tab2 = new String[500];

        for (int i = 0 ; i < e.liste.size(); i++) {

            tab[i]=e.liste.get(i);

        }
        for (int i = 0 ; i < this.liste.size(); i++) {

            tab2[i]=this.liste.get(i);

        }

        tmpunion.ajouter(tab);


        return null ;
    }
    //Renvoie l’intersection de l’ensemble e et l’ensemble courant
    public EnsembleChaine intersection(EnsembleChaine e){


        return null ;
    }
    //Renvoie l’union disjointe de l’ensemble e et l’ensemble courant
    public EnsembleChaine unionDisjointe(EnsembleChaine e){
        return null ;
    }

}
