package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.GestionClientDaoImpl;
import fr.adaming.dao.IGestionClientDao;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

@Service("gestionClientServiceBean")
public class GestionClientService implements IGestionClientService {
	
	@Autowired
	private IGestionClientDao gestionClientDao = new GestionClientDaoImpl();
	
	////
	public IGestionClientDao getGestionClientDao() {
		return gestionClientDao;
	}
	public void setGestionClientDao(IGestionClientDao gestionClientDao) {
		this.gestionClientDao = gestionClientDao;
	}

	////
	@Override
	public int ifConseillerExistService(Conseiller conseiller) {

		return gestionClientDao.ifConseillerExistDao(conseiller);
	}
	
	@Override
	public void ajouterClientService(Client client) {
		
		gestionClientDao.ajouterClientDao(client);	
	}

	@Override
	public void modifierClientService(Client client) {
		
		gestionClientDao.modifierClientDao(client);
	}
	
	@Override
	public void supprimmerClientService(Client client) {
		
		gestionClientDao.supprimmerClientDao(client);
	}

	@Override
	public List<Client> afficherClientService() {
		
		return gestionClientDao.afficherClientDao();
	}
}
