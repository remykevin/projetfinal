package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public interface IGestionClientDao {
	
	public int ifConseillerExistDao(Conseiller conseiller);
	public void ajouterClientDao(Client client);
	public void modifierClientDao(Client client);
	public void supprimmerClientDao(Client client);
	public List<Client> afficherClientDao();
}
