package Main;

import java.util.ArrayList;

public class EnsembleChaine { 
	
	private ArrayList< String > liste; 

	
public EnsembleChaine(){   
	liste = new ArrayList<String>() ; 
	} 


public ArrayList<String> getListe() {
	return liste;
}



//Ajoute chaque chaine de tab, si elle n�existe pas d�j�, � l�ensemble  
public void ajouter(String[] tab) {
	for(int i=0;i<tab.length;i++) {
		if(!this.liste.contains(tab[i]))
		this.liste.add(tab[i]);
	}
	} 

//Test si l�ensemble e est �quivalent � l�ensemble courant  
public boolean equals(EnsembleChaine e) {
	boolean y=false;
	int element=0;
	if(e.getListe().size()==this.liste.size()) {
		for(int i = 0; i<this.liste.size();i++) {
			if(this.liste.contains(e.getListe().get(i))){
				element++;
			}
		}
		if(element==this.liste.size()) {
			y=true;
		}
	}
	return y ; 
	} 


//Renvoie l�union de l�ensemble e et l�ensemble courant  
public EnsembleChaine union(EnsembleChaine e){
	
	EnsembleChaine tmp= e;
	EnsembleChaine tmp1 = this;
	
	tmp.getListe().removeAll(this.liste);
	tmp1.getListe().removeAll(e.getListe());
	
	tmp.getListe().addAll(tmp1.getListe());
	
	return tmp;
	} 

//Renvoie l�intersection de l�ensemble e et l�ensemble courant  
public EnsembleChaine intersection(EnsembleChaine e){ 
	EnsembleChaine tmp = new EnsembleChaine();
	tmp = e;
	tmp.getListe().retainAll(this.liste);
	
	return tmp;
	} 


//Renvoie l�union disjointe de l�ensemble e et l�ensemble courant  
public EnsembleChaine unionDisjointe(EnsembleChaine e){ 
	EnsembleChaine tmp = new EnsembleChaine();
	for(String str : this.getListe()) {
		if(!e.getListe().contains(str)) {
			tmp.getListe().add(str);
		}
	}
	
	for(String str : e.getListe()) {
		if(!this.getListe().contains(str)) {
			tmp.getListe().add(str);
		}
	}
	
	return tmp;
	}
}