package fr.m2i.Personnage;

import fr.m2i.Arme.Arme;

public class Sorcier extends Personnage{
	
	private Arme _pouvoir;
	
	public Sorcier(String nom, String prenom) {
		super(nom, prenom, 30, 4);
		this._pouvoir = new Arme("Boule de feu", 4, 1, 1);
	}

	@Override
	public int attaquer() {
		int degats = 0;
		if ((this.getPtAction() - this._pouvoir.getCoutAction()) > 0) {
			this.setPtAction(this.getPtAction() - this._pouvoir.getCoutAction());
			degats = this._pouvoir.getPuissance();
		}
		this.setPtAction(this.getPtAction() + this._pouvoir.getRecupAction());
		
		return degats;
	}
}
