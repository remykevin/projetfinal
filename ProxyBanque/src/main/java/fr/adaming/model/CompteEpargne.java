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

@Entity(name="compteEpargneBean")
@Table(name="comptesEpargnes")
@DiscriminatorValue (value="compteEpargne")
public class CompteEpargne implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compteEpa")
	private int id;
	@Column(name="numCompte")
	private int numCompte;
	@Column(name="solde")
	private double solde;
	@Column(name="dateOuverture")
	private Date dateOuverture;
	@Column(name="taux")
	private double taux=0.03;

	////
	/*Liaison avec Client*/
	@OneToOne(mappedBy="compteEpargneClient")
	@JoinColumn(name="ClientID", referencedColumnName="id_client")
	private Client client;
	
	////
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(int numCompte, double solde, Date dateOuverture,
			double taux, Client client) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.taux = taux;
		this.client = client;
	}
	public CompteEpargne(int id, int numCompte, double solde,
			Date dateOuverture, double taux, Client client) {
		super();
		this.id = id;
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.taux = taux;
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
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
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
		return "CompteEpargne [id=" + id + ", numCompte=" + numCompte
				+ ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ ", taux=" + taux + ", client=" + client + "]";
	}
}
