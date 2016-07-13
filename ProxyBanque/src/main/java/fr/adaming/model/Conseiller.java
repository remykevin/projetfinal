package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	////
	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", nom=" + nom + ", password="
				+ password + "]";
	}
}
