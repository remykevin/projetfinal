package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="clientBean")
@Table(name="clients")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	@Column(name="nom_client")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="adresse")
	private String adresse;
	@Column(name="codePostal")
	private String codePostal;
	@Column(name="ville")
	private String ville;
	@Column(name="telephone")
	private String telephone;
	
	////
	/*Liaison avec Agence*/
	@ManyToOne
	@JoinColumn(name="AgenceID", referencedColumnName="id_agence")
	private Agence agence;
	/*Liaison avec Conseiller*/
	@ManyToOne
	@JoinColumn(name="ConseillerID", referencedColumnName="id_conseiller")
	private Conseiller conseiller;
	/*Liaison avec CarteBancaire*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="carteID", referencedColumnName="id_carte")
	private CarteBancaire carteBancaireClient;
	/*Liaison avec Compte Courant*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="compteCouID", referencedColumnName="id_compteCou")
	private CompteCourant compteCourantClient;
	/*Liaison avec Compte Epargne*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="compteEpaID", referencedColumnName="id_compteEpa")
	private CompteEpargne compteEpargneClient;
	
	////
	public Client() {
		super();
	}
	public Client(String nom, String prenom, String adresse, String codePostal,
			String ville, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}
	public Client(int id, String nom, String prenom, String adresse,
			String codePostal, String ville, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}
	
	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	public CarteBancaire getCarteBancaireClient() {
		return carteBancaireClient;
	}
	public void setCarteBancaireClient(CarteBancaire carteBancaireClient) {
		this.carteBancaireClient = carteBancaireClient;
	}
	public CompteCourant getCompteCourantClient() {
		return compteCourantClient;
	}
	public void setCompteCourantClient(CompteCourant compteCourantClient) {
		this.compteCourantClient = compteCourantClient;
	}
	public CompteEpargne getCompteEpargneClient() {
		return compteEpargneClient;
	}
	public void setCompteEpargneClient(CompteEpargne compteEpargneClient) {
		this.compteEpargneClient = compteEpargneClient;
	}
	
	////
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}
}
