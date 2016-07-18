package fr.adaming.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;
import fr.adaming.service.IGestionClientService;
import fr.adaming.service.IGestionTacheService;

@ManagedBean(name="gestionMB")
@SessionScoped
public class GestionManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;

	////
	private Client client;
	private List<Client> listeClient;
	private Conseiller conseiller;
	@ManagedProperty(value="#{gestionClientServiceBean}")
	IGestionClientService gestionClientService;
	@ManagedProperty(value="#{gestionTacheServiceBean}")
	IGestionTacheService gestionTacheService;

	////
	public GestionManagedBean() {
		this.client = new Client();
		this.conseiller = new Conseiller();
	}

	////
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Client> getListeClient() {
		return listeClient;
	}
	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public IGestionClientService getGestionClientService() {
		return gestionClientService;
	}
	public void setGestionClientService(IGestionClientService gestionClientService) {
		this.gestionClientService = gestionClientService;
	}
	public IGestionTacheService getGestionTacheService() {
		return gestionTacheService;
	}
	public void setGestionTacheService(IGestionTacheService gestionTacheService) {
		this.gestionTacheService = gestionTacheService;
	}

	////
	public String ifExistMB() 
	{
		int verif = gestionClientService.ifConseillerExistService(conseiller);
		
		if(verif == 1)
		{
			return "succes";
		}
		else
		{
			return "echec";
		}
	}
	
	public String addMB(){
		
		gestionClientService.ajouterClientService(client);
		return "add";
	}
	
	public String updateMB(){
		
		gestionClientService.modifierClientService(client);
		return "update";
	}
	
	public String deleteMB(){
		
		gestionClientService.supprimmerClientService(client);
		return "delete";
	}
	
	public String getClientMB(){
		
		listeClient = gestionClientService.afficherClientService();
		return "affiche";
	}
}
