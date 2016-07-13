package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="compteEpargneBean")
@Table(name="comptesEpargnes")
public class CompteEpargne extends Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compteEpa")
	private int id;
	@Column(name="taux")
	private double taux=0.03;

	////
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}
	public CompteEpargne(int id, double taux) {
		super();
		this.id = id;
		this.taux = taux;
	}

	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	////
	@Override
	public String toString() {
		return "CompteEpargne [id=" + id + ", taux=" + taux + "]";
	}
}
