package fr.adaming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Compte;

@Repository("gestionTacheDao")
@Transactional
public class GestionTacheDaoImpl implements IGestionTacheDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	////
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	////
	@Override
	public void virementDao(Compte compteDebit, Compte compteCredit) {
		
		
	}

	@Override
	public void simulationDao() {
		
		
	}

	@Override
	public void placementDao(Compte compte) {
		
		
	}

	@Override
	public void auditDao(List<Compte> listeCompte) {
		
		
	}
}
