package fr.adaming.model;

import java.util.Date;

public abstract class Compte {
	private int numCompte;
	private double solde;
	private Date dateOuverture;

	
	/**
	 * constructeurs
	 */
	public Compte() {
		super();
	}

	public Compte(int numCompte, double solde, Date dateOuverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
/**
 * getters et setters
 * @return
 */
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde
				+ ", dateOuverture=" + dateOuverture + "]";
	}

}
