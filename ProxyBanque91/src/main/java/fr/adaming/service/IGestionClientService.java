package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public interface IGestionClientService {

	public int ifConseillerExistService(Conseiller conseiller);
	public void ajouterClientService(Client client);
	public void modifierClientService(Client client);
	public void supprimmerClientService(Client client);
	public List<Client> afficherClientService();
}
