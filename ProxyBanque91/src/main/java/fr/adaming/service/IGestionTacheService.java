package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Compte;

public interface IGestionTacheService {

	public void virementService(Compte compteDebit, Compte compteCredit); 
	public void simulationService();
	public void placementService(Compte compte);
	public void auditService(List<Compte> listeCompte);
}
