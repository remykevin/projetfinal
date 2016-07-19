package fr.adaming.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Compte {
	
	private String numCompte; 
	private float solde;
	private Date dateCreation;

	////
	public Compte() {
		super();
	}
	public Compte(String numCompte, float solde, Date dateCreation) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	//// 
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	////
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde
				+ ", dateCreation=" + dateCreation + "]";
	}	
}
