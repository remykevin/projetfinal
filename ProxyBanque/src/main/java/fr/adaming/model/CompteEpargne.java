package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;

public class CompteEpargne extends Compte {
	@Column(name="taux")
private double taux=0.03;


/**
 * constructeurs
 */
public CompteEpargne() {
	super();
	
}


public CompteEpargne(int numCompte, double solde, Date dateOuverture,
		Client client,double taux) {
	super(numCompte, solde, dateOuverture, client);
	this.taux=taux;
}


/**
 * getters et setters
 * @return
 */
public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}

@Override
public String toString() {
	return "CompteEpargne [taux=" + taux + "]";
}



}
