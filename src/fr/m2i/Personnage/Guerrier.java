package fr.m2i.Personnage;

import fr.m2i.Arme.Arme;

public class Guerrier extends Personnage{
	
	private Arme _epee;
	
	public Guerrier(String nom, String prenom) {
		super(nom, prenom, 40, 3);
		this._epee = new Arme("Ragnarok", 7, 2, 1);
	}

	@Override
	public int attaquer() {
		int degats = 0;
		if ((this.getPtAction() - this._epee.getCoutAction()) > 0) {
			this.setPtAction(this.getPtAction() - this._epee.getCoutAction());
			degats = this._epee.getPuissance();
		}
		this.setPtAction(this.getPtAction() + this._epee.getRecupAction());
		
		return degats;
	}
}
