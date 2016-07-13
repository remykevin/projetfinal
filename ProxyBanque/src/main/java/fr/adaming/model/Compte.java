package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="compteBean")
@Table(name="comptes")
public abstract class Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compte")
	private int id;
	@Column(name="numCompte")
	private int numCompte;
	@Column(name="solde")
	private double solde;
	@Column(name="dateOuverture")
	private Date dateOuverture;

	////
	public Compte() {
		super();
	}
	public Compte(int numCompte, double solde, Date dateOuverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	public Compte(int id, int numCompte, double solde, Date dateOuverture) {
		super();
		this.id = id;
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	////
	@Override
	public String toString() {
		return "Compte [id=" + id + ", numCompte=" + numCompte + ", solde="
				+ solde + ", dateOuverture=" + dateOuverture + "]";
	}
}
