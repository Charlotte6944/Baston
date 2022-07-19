package fr.m2i;

import fr.m2i.Personnage.Personnage;

public class Affichage {
	public void afficheInfoPersonnage(Personnage p) {
		System.out.print(p.getNom() + " " + p.getPrenom());
		System.out.println(" -- PV : " + p.getPv() + " / PA : " + p.getPtAction());
	}
	
	public void separateur() {
		System.out.println("==========================================");
	}
	
	public void affiche(String s) {
		System.out.println(s);
	}
}
