package fr.m2i.Arme;

public class Arme {
	
	private String _nom;
	private int _puissance;
	private int _coutAction;
	private int _recupAction;
	
	public Arme(String nom, int puissance, int coutAction, int recupAction) {
		this._nom = nom;
		this._puissance = puissance;
		this._coutAction = coutAction;
		this._recupAction = recupAction;
	}

	public String get_nom() {
		return _nom;
	}

	public void set_nom(String nom) {
		this._nom = nom;
	}
	
	public int getPuissance() {
		return _puissance;
	}

	public void setPuissance(int puissance) {
		this._puissance = puissance;
	}

	public int getCoutAction() {
		return _coutAction;
	}

	public void setCoutAction(int coutAction) {
		this._coutAction = coutAction;
	}

	public int getRecupAction() {
		return _recupAction;
	}

	public void setRecupAction(int recupAction) {
		this._recupAction = recupAction;
	}
}
