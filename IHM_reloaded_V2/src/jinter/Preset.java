package jinter;

public class Preset {

	public Preset(int largeur, int hauteur, int débit) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.débit = débit;

	}

	private int largeur;
	private int hauteur;
	private int débit;

	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getDébit() {
		return débit;
	}
	public void setDébit(int débit) {
		this.débit = débit;
	}
	
	@Override
	public String toString() {
		
		return this.largeur + "x" + this.hauteur + "@" + this.débit ;
	}
}
//