package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteCourantBean")
@Table(name="comptesCourants")
@DiscriminatorValue (value="compteCourant")
public class CompteCourant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compteCou")
	private int id;
	@Column(name="numCompte")
	private int numCompte;
	@Column(name="solde")
	private double solde;
	@Column(name="dateOuverture")
	private Date dateOuverture;
	@Column(name="decouvert")
	private double decouvert=1000;
	
	////
	/*Liaison avec Client*/
	@OneToOne(mappedBy="compteCourantClient")
	@JoinColumn(name="ClientID", referencedColumnName="id_client")
	private Client client;

	////
	public CompteCourant() {
		super();
	}	
	public CompteCourant(int numCompte, double solde, Date dateOuverture,
			double decouvert, Client client) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.decouvert = decouvert;
		this.client = client;
	}
	public CompteCourant(int id, int numCompte, double solde,
			Date dateOuverture, double decouvert, Client client) {
		super();
		this.id = id;
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.decouvert = decouvert;
		this.client = client;
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
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	////
	@Override
	public String toString() {
		return "CompteCourant [id=" + id + ", numCompte=" + numCompte
				+ ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ ", decouvert=" + decouvert + ", client=" + client + "]";
	}
}
