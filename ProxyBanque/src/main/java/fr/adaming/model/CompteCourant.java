package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="compteCourantBean")
@Table(name="comptesCourants")
public class CompteCourant extends Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compteCou")
	private int id;
	@Column(name="decouvert")
	private double decouvert=1000;

	////
	public CompteCourant() {
		super();
	}
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	public CompteCourant(int id, double decouvert) {
		super();
		this.id = id;
		this.decouvert = decouvert;
	}
	
	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	////
	@Override
	public String toString() {
		return "CompteCourant [id=" + id + ", decouvert=" + decouvert + "]";
	}
}
