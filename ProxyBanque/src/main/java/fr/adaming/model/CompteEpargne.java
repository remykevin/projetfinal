package fr.adaming.model;

import java.util.Date;

public class CompteEpargne extends Compte {
private double taux=0.03;


/**
 * constructeurs
 */
public CompteEpargne() {
	super();
	
}

public CompteEpargne(int numCompte, double solde, Date dateOuverture,double taux) {
	super(numCompte, solde, dateOuverture);
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
