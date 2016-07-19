package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.GestionTacheDaoImpl;
import fr.adaming.dao.IGestionTacheDao;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteCourant;

@Service("gestionTacheServiceBean")
public class GestionTacheServiceImpl implements IGestionTacheService {

	@Autowired
	private IGestionTacheDao gestionTacheDao;
	
	////
	public IGestionTacheDao getGestionTacheDao() {
		return gestionTacheDao;
	}
	public void setGestionTacheDao(IGestionTacheDao gestionTacheDao) {
		this.gestionTacheDao = gestionTacheDao;
	}

	////
	@Override
	public void virementService(Compte compteDebit, Compte compteCredit) {
		
		double seuil = ((CompteCourant) compteDebit).getDecouvert();
		
		if (compteDebit.getSolde()<seuil)
		{
			System.out.println("Virement refusé !!! Solde minimum de " +seuil +"€ atteint");
		}
		else 
		{
			gestionTacheDao.virementDao(compteDebit, compteCredit);
		}
	}

	@Override
	public void simulationService() {
		
		gestionTacheDao.simulationDao();
	}

	@Override
	public void placementService(Compte compte) {
		
		double seuil = 500000;
		
		if (compte.getSolde()<seuil)
		{
			System.out.println("Placement refusé !!! Solde de " +seuil +"€ nécéssaire");
		}
		else 
		{
			gestionTacheDao.placementDao(compte);
		}
	}

	@Override
	public void auditService(List<Compte> listeCompte) {
		
		gestionTacheDao.auditDao(listeCompte);
	}
}
