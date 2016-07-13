package fr.adaming.managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Client;
import fr.adaming.service.IGestionClientService;

@ManagedBean(name = "gestionMB")
@SessionScoped
public class GestionManagedBean implements Serializable{
	@ManagedProperty(value = "#{gestionClientServiceBean}")
	IGestionClientService gestionService;
	
	private Client cl;

	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}

	public IGestionClientService getGestionService() {
		return gestionService;
	}

	public void setGestionService(IGestionClientService gestionService) {
		this.gestionService = gestionService;
	}

	@Override
	public String toString() {
		return "GestionManagedBean [gestionService=" + gestionService + ", cl="
				+ cl + "]";
	}
	public void ajouter(){
		gestionService.ajouterClient(cl);
	}
	public void update(){
		gestionService.modifierClient(cl);;
	}
	public void delete(){
		gestionService.supprimmerClient(cl);;
	}
	public void getById(int id){
		cl= gestionService.afficherClientParId(id);
	}
}
