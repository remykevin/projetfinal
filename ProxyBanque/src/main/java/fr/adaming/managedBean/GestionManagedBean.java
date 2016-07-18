package fr.adaming.managedBean;

import java.io.Serializable;

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
	private Client cl;
	private Conseiller co;
	@ManagedProperty(value="#{gestionClientService}")
	IGestionClientService gestionClientService;
	@ManagedProperty(value="#{gestionTacheService}")
	IGestionTacheService gestionTacheService;

	////
	
	//Constructeur avec tout les param
	public GestionManagedBean(Client cl, Conseiller co,
			IGestionClientService gestionClientService,
			IGestionTacheService gestionTacheService) {
		super();
		this.cl = cl;
		this.co = co;
		this.gestionClientService = gestionClientService;
		this.gestionTacheService = gestionTacheService;
	}
	//Constructeur vide
	public GestionManagedBean() {
		this.cl=new Client();
		this.co=new Conseiller();
	}

	////
	public Client getCl() {
		return cl;
	}
	public void setCl(Client cl) {
		this.cl = cl;
	}

	public Conseiller getCo() {
		return co;
	}
	public void setCo(Conseiller co) {
		this.co = co;
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
	public void addMB(){
		gestionClientService.ajouterClient(cl);
	}
	public void updateMB(){
		gestionClientService.modifierClient(cl);;
	}
	public void deleteMB(){
		gestionClientService.supprimmerClient(cl);;
	}
	public void getById(int id){
		cl= gestionClientService.afficherClientParId(id);
	}
}
