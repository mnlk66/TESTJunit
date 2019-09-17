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

        String[] tab = e.liste.toArray(new String[e.liste.size()]);
        String[] tab2 = this.liste.toArray(new String[this.liste.size()]);
        tmpunion.ajouter(tab);
        tmpunion.ajouter(tab2);


        return tmpunion;
    }
    //Renvoie l’intersection de l’ensemble e et l’ensemble courant
    public EnsembleChaine intersection(EnsembleChaine e){

        EnsembleChaine tmpintersection = new EnsembleChaine();

        for(String n : e.liste) {

            if(!this.liste.contains(n))
               tmpintersection.liste.add(n);


        }




        return tmpintersection ;
    }
    //Renvoie l’union disjointe de l’ensemble e et l’ensemble courant
    public EnsembleChaine unionDisjointe(EnsembleChaine e){

        EnsembleChaine tmpuniondis = new EnsembleChaine();

        for(String n : e.liste) {

            if(this.liste.contains(n))
                tmpuniondis.liste.add(n);


        }




        return tmpuniondis ;
    }

}
