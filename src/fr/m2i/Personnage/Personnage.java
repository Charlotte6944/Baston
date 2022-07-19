package fr.m2i.Personnage;

public abstract class Personnage {
	private int _pv;
	private int _ptAction;
	private String _nom;
	private String _prenom;
	
	public Personnage(String nom, String prenom, int pv, int ptAction) {
		this._nom = nom;
		this._prenom = prenom;
		this._pv = pv;
		this._ptAction = ptAction;
	}
	
	public abstract int attaquer();
	
	public void subir(int degats) {
		this._pv -= degats;
	}
	
	public boolean estVivant() {
		if(this._pv > 0) {
			return true;
		}
		
		return false;
	}
	
	public int getPv() {
		return _pv;
	}
	public void setPv(int pv) {
		this._pv = pv;
	}
	
	public int getPtAction() {
		return _ptAction;
	}

	public void setPtAction(int ptAction) {
		this._ptAction = ptAction;
	}

	public String getNom() {
		return _nom;
	}
	public void setNom(String nom) {
		this._nom = nom;
	}
	public String getPrenom() {
		return _prenom;
	}
	public void setPrenom(String prenom) {
		this._prenom = prenom;
	}
}
