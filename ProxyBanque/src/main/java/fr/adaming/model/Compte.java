package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;

public abstract class Compte {
	@Column(name="numCompte")
	private int numCompte;
	@Column(name="solde")
	private double solde;
	@Column(name="dateOuverture")
	private Date dateOuverture;
	@Column(name="client")
	private Client client;

	
	/**
	 * constructeurs
	 */
	public Compte() {
		super();
	}

	public Compte(int numCompte, double solde, Date dateOuverture,Client client) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client=client;
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
				+ ", dateOuverture=" + dateOuverture + ", client=" + client
				+ "]";
	}

	

}
