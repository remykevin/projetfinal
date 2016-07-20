package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

@Repository("gestionClientDao")
@Transactional
public class GestionClientDaoImpl implements IGestionClientDao{
	
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
	public int ifConseillerExistDao(Conseiller conseiller) {
		
		Session session = sessionFactory.getCurrentSession();
		
		String hqlReq = "SELECT COUNT(id) FROM conseillerBean AS e WHERE e.nom_conseiller = :nom AND e.mdp_conseiller = :password";
		Query query = session.createSQLQuery(hqlReq);
		query.setString("nom", conseiller.getNom());
		query.setString("password", conseiller.getPassword());
		
		int rs = query.executeUpdate();	
		
		return rs;
	}
	
	@Override
	public void ajouterClientDao(Client client) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(client);		
	}

	@Override
	public void modifierClientDao(Client client) {
		
		Session session = sessionFactory.getCurrentSession();
		Client cl1 = (Client) session.get(Client.class, client.getId());
		
		cl1.setNom(client.getNom());
		cl1.setPrenom(client.getPrenom());
		cl1.setAdresse(client.getAdresse());
		cl1.setCodePostal(client.getCodePostal());
		cl1.setVille(client.getVille());
		cl1.setTelephone(client.getTelephone());
		
		session.update(cl1);
	}
	
	@Override
	public void supprimmerClientDao(Client client) {
		
		Session session = sessionFactory.getCurrentSession();
		
		String hqlReq = "DELETE FROM clientBean AS e WHERE e.id = :id";	
		Query query = session.createQuery(hqlReq);
		query.setInteger("id", client.getId());
		
		int rowsDeleted = query.executeUpdate();
	}

	@Override
	public List<Client> afficherClientDao() {
		
		//ouvrir une session
		Session session = sessionFactory.getCurrentSession();
				
		//declaration de la requete
		String hqlreq = "FROM clientBean AS e";
		Query query = session.createQuery(hqlreq);
				
		//pagination
		query.setFirstResult(0);
		query.setMaxResults(50); //maximum d'affichage de la BD (ici 1 seul employe)
		List<Client> listclient = query.list();
				
		return listclient;
	}
}
