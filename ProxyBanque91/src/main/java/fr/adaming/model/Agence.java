package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="agenceBean")
@Table(name="agences")
public class Agence implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agence")
	private int id;
	@Column(name="numeroId")
	private String numeroId;
	@Column(name="dateCreation")
	private Date dateCreation;
	
	////
	/*Liaison avec Gerant*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gerantID", referencedColumnName="id_gerant")
	private Gerant gerantAgence;
	/*Liaison avec Conseiller*/
	@OneToMany(mappedBy="agence", cascade=CascadeType.ALL)
	private List<Conseiller> conseillerAgence;
	/*Liaison avec Client*/
	@OneToMany(mappedBy="agence", cascade=CascadeType.ALL)
	private List<Client> clientAgence;
	
	////
	public Agence() {
		super();
	}
	public Agence(String numeroId, Date dateCreation) {
		super();
		this.numeroId = numeroId;
		this.dateCreation = dateCreation;
	}
	public Agence(int id, String numeroId, Date dateCreation) {
		super();
		this.id = id;
		this.numeroId = numeroId;
		this.dateCreation = dateCreation;
	}
	
	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroId() {
		return numeroId;
	}
	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Gerant getGerantAgence() {
		return gerantAgence;
	}
	public void setGerantAgence(Gerant gerantAgence) {
		this.gerantAgence = gerantAgence;
	}
	public List<Conseiller> getConseillerAgence() {
		return conseillerAgence;
	}
	public void setConseillerAgence(List<Conseiller> conseillerAgence) {
		this.conseillerAgence = conseillerAgence;
	}
	public List<Client> getClientAgence() {
		return clientAgence;
	}
	public void setClientAgence(List<Client> clientAgence) {
		this.clientAgence = clientAgence;
	}
	
	////
	@Override
	public String toString() {
		return "Agence [id=" + id + ", numeroId=" + numeroId
				+ ", dateCreation=" + dateCreation + "]";
	}
}
