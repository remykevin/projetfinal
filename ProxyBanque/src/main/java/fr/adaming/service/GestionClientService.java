package fr.adaming.service;

import org.springframework.stereotype.Service;

import fr.adaming.dao.GestionClientDaoImpl;
import fr.adaming.model.Client;
@Service("gestionClientServiceBean")
public class GestionClientService implements IGestionClientService {
GestionClientDaoImpl gestionClient=new GestionClientDaoImpl();
	@Override
	public void ajouterClient(Client client) {
		gestionClient.ajouterClient(client);
		
	}

	@Override
	public void supprimmerClient(Client client) {
		gestionClient.supprimmerClient(client);
		
	}

	@Override
	public void modifierClient(Client client) {
		gestionClient.modifierClient(client);
		
	}

	@Override
	public Client afficherClientParId(int idClient) {
		
		return gestionClient.afficherClientParId(idClient);
	}

}
