package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity(name="compteCourantBean")
@Table(name="comptesCourants")
public class CompteCourant extends Compte {
	@Column(name="decouvert")
private double decouvert=1000;
	



/**
 * Constructeur
 */

	public CompteCourant() {
		super();
		
	}
	public CompteCourant(int numCompte, double solde, Date dateOuverture,
			Client client, double decouvert) {
		super(numCompte, solde, dateOuverture, client);
		this.decouvert=decouvert;
	}
/**
 * getters et setters
 * @return
 */
public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}


/**
 * toString
 */
@Override
public String toString() {
	return "CompteCourant [decouvert=" + decouvert + "]";
}


}















