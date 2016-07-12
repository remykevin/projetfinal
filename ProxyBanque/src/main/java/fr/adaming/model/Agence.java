package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="numero_identification")
	private String numeroId;
	@Column(name="date_création")
	private Date dateCreation;
	
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
	
	////
	@Override
	public String toString() {
		return "Agence [id=" + id + ", numeroId=" + numeroId
				+ ", dateCreation=" + dateCreation + "]";
	}
}
