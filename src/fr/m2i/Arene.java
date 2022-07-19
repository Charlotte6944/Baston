package fr.m2i;

import fr.m2i.Personnage.*;

public class Arene {
	
	Affichage aff;
	
	public Arene () {
		this.aff = new Affichage();
	}

	public void execute() {
		Guerrier guerrier = new Guerrier("Jean", "Estelle");
		Sorcier sorcier = new Sorcier("Matin", "Martin");
		Healer healer = new Healer("Fraise", "Thomas");
		
		Combat(healer,guerrier);
	}

	public void Combat(Personnage p1, Personnage p2) {
		
		while(p1.estVivant() && p2.estVivant()) {			
			this.aff.afficheInfoPersonnage(p1);
			this.aff.afficheInfoPersonnage(p2);
			int rand = (int) Math.round(Math.random());
			if (rand == 0) {
				p2.subir(p1.attaquer());
			} else {
				p1.subir(p2.attaquer());
			}
			this.aff.separateur();
		}
		
		if (p1.estVivant()) {
			aff.affiche(p1.getNom() + " " + p1.getPrenom() + " est le vainqueur");
		}
		
		if (p2.estVivant()) {
			aff.affiche(p2.getNom() + " " + p2.getPrenom() + " est le vainqueur");
		}
	}
}
