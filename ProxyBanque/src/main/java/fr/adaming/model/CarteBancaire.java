package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="carteBancaireBean")
@Table(name="carteBancaires")
public class CarteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;
	
	////
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carte")
	private int id;
	@Column(name="numero")
	private int numero;
	@Column(name="premier")
	private boolean premier;
	
	////
	public CarteBancaire() {
		super();
	}
	public CarteBancaire(int numero, boolean premier) {
		super();
		this.numero = numero;
		this.premier = premier;
	}
	public CarteBancaire(int id, int numero, boolean premier) {
		super();
		this.id = id;
		this.numero = numero;
		this.premier = premier;
	}
	
	////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isPremier() {
		return premier;
	}
	public void setPremier(boolean premier) {
		this.premier = premier;
	}
	
	////
	@Override
	public String toString() {
		return "CarteBancaire [id=" + id + ", numero=" + numero + ", premier="
				+ premier + "]";
	}
}
