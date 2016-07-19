package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="conseillerBean")
@Table(name="conseillers")
public class Conseiller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_conseiller")
	private int id;
	@Column(name="nom_conseiller")
	private String nom;
	@Column(name="mdp_conseiller")
	private String password;
	
	////
	/*Liaison avec Agence*/
	@ManyToOne
	@JoinColumn(name="AgenceID", referencedColumnName="id_agence")
	private Agence agence;
	/*Liaison avec Gerant*/
	@ManyToOne
	@JoinColumn(name="GerantID", referencedColumnName="id_gerant")
	private Gerant gerant;
	/*Liason avec Client*/
	@OneToMany(mappedBy="conseiller")
	private List<Client> clientConseiller;
	
	////
	public Conseiller() {
		super();
	}
	public Conseiller(String nom, String password) {
		super();
		this.nom = nom;
		this.password = password;
	}
	public Conseiller(int id, String nom, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Gerant getGerant() {
		return gerant;
	}
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	public List<Client> getClientConseiller() {
		return clientConseiller;
	}
	public void setClientConseiller(List<Client> clientConseiller) {
		this.clientConseiller = clientConseiller;
	}
	
	////
	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", nom=" + nom + ", password="
				+ password + "]";
	}
}
