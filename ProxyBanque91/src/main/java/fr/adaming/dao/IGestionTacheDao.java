package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Compte;

public interface IGestionTacheDao {

	public void virementDao(Compte compteDebit, Compte compteCredit); 
	public void simulationDao();
	public void placementDao(Compte compte);
	public void auditDao(List<Compte> listeCompte);
}
