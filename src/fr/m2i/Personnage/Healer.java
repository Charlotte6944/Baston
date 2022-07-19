package fr.m2i.Personnage;

import fr.m2i.Arme.Arme;

public class Healer extends Personnage{
	
	private static final int MAXHP = 35;
	private final int SOIN = 3;
	
	public Healer(String nom, String prenom) {
		super(nom, prenom, MAXHP, 5);
	}
	
	public void heal() {
		if(this.getPv() + this.SOIN > MAXHP) {
			this.setPv(MAXHP);
		} else {			
			this.setPv(this.getPv() + this.SOIN);
		}
	}

	@Override
	public int attaquer() {
		this.heal();
		return 1;
	}
}
