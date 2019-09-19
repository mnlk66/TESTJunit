package Main;

import java.util.ArrayList;
import java.util.HashSet;

public class EnsembleChaineConstantin {
    ArrayList< String > liste;

    public EnsembleChaineConstantin(){
        liste = new ArrayList<String>() ;
    }

    //Ajoute chaque chaine de tab, si elle n’existe pas déjà, à l’ensemble
    public void ajouter(String[] tab) {
        if(tab == null || tab.length <= 0) return;
        for ( int i = 0; i < tab.length; i++ ) {
            if(!liste.contains(tab[i])) liste.add(tab[i]);
        }
    }

    //Test si l’ensemble e est équivalent à l’ensemble courant
    public boolean equals(EnsembleChaine e) {
        if(e == null || liste.size() != e.liste.size()) return false;
        else{
            for ( int i = 0; i < e.liste.size(); i++ ) {
                if(!liste.contains(e.liste.get(i))) return false;
            }
            return true;
        }
    }

    //Renvoie l’union de l’ensemble e et l’ensemble courant
    public EnsembleChaine union(EnsembleChaine e){
        EnsembleChaine newliste = new EnsembleChaine();
        newliste.liste.addAll(liste);
        if(e != null) newliste.liste.addAll(e.liste);
        newliste.liste = new ArrayList<String>(new HashSet<String>(newliste.liste));
        return newliste ;
    }

    //Renvoie l’intersection de l’ensemble e et l’ensemble courant
    public EnsembleChaine intersection(EnsembleChaine e){
        EnsembleChaine newliste = new EnsembleChaine();
        if (e == null || e.liste.size() == 0 || liste.size() ==0) return newliste;
        for ( int i = 0; i < e.liste.size(); i++ ) {
            if(liste.contains(e.liste.get(i))) newliste.ajouter(new String[]{e.liste.get(i)});
        }
        return newliste ;
    }

    //Renvoie l’union disjointe de l’ensemble e et l’ensemble courant
    public EnsembleChaine unionDisjointe(EnsembleChaine e){
        EnsembleChaine newliste = new EnsembleChaine();
        if (e == null || e.liste.size() == 0 || liste.size() == 0) return newliste;
        for ( int i = 0; i < e.liste.size(); i++ ) {
            if(!liste.contains(e.liste.get(i))) newliste.ajouter(new String[]{e.liste.get(i)});
        }
        for ( int i = 0; i < liste.size(); i++ ) {
            if(!e.liste.contains(liste.get(i))) newliste.ajouter(new String[]{liste.get(i)});
        }
        return newliste ;
    }
}