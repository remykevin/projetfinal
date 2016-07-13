package fr.adaming.model;

import java.util.Date;

public class CompteCourant extends Compte {
private double decouvert=1000;
private Client client;



/**
 * Constructeur
 */
public CompteCourant() {
	super();
}
public CompteCourant(int numCompte, double solde, Date dateOuverture,double decouvert, Client client) {
	super(numCompte, solde, dateOuverture);
	this.decouvert=decouvert;
	this.client=client;
	
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
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
@Override
public String toString() {
	return "CompteCourant [decouvert=" + decouvert + ", client=" + client + "]";
}














}
