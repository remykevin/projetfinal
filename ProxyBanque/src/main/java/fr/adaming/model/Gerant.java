package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="gerantBean")
@Table(name="gerants")
public class Gerant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gerant")
	private int id;
	@Column(name="nom_gerant")
	private String nom;
	@Column(name="mdp_gerant")
	private String password;
	
	////
	/*Liaison avec Agence*/
	@OneToOne(mappedBy="gerantAgence")
	@JoinColumn(name="AgenceID", referencedColumnName="id_agence")
	private Agence agence;
	/*Liaison avec Conseiller*/
	@OneToMany(mappedBy="gerant")
	private List<Conseiller> conseillerGerant;
	
	////
	public Gerant() {
		super();
	}
	public Gerant(String nom, String password) {
		super();
		this.nom = nom;
		this.password = password;
	}
	public Gerant(int id, String nom, String password) {
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
	public List<Conseiller> getConseillerGerant() {
		return conseillerGerant;
	}
	public void setConseillerGerant(List<Conseiller> conseillerGerant) {
		this.conseillerGerant = conseillerGerant;
	}
	
	////
	@Override
	public String toString() {
		return "Gerant [id=" + id + ", nom=" + nom + ", password=" + password
				+ "]";
	}
}
