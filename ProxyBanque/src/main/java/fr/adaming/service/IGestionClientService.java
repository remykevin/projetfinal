package fr.adaming.service;

import fr.adaming.model.Client;

public interface IGestionClientService {
	public void ajouterClient (Client client);
	public void supprimmerClient (Client client);
	public void modifierClient (Client client);
	public Client afficherClientParId(int idClient);
}
