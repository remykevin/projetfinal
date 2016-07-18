package fr.adaming.dao;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Client;

@Repository
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
	public void ajouterClient(Client client) {
		System.out.println("je suis arrivé dans la couche dao");
		Session session = sessionFactory.getCurrentSession();
		session.save(client);		
	}

	@Override
	public void supprimmerClient(Client client) {
		
		Session session = sessionFactory.getCurrentSession();
		String hqlReq="delete clientBean  where id =:id1";
		Query query=session.createQuery(hqlReq);
		query.setParameter("id1", client.getId());
		query.executeUpdate();
		
	}

	@Override
	public void modifierClient(Client client) {
		
		Session session = sessionFactory.getCurrentSession();
		String hqlReq="update clientBean set nom=:nom1, prenom= :prenom1 , codePostal=:cp1,adresse=:adresse1,ville=:ville1,"
				+ " telephone=:telephone1 "+ " where id =:id1";
		Query query=session.createQuery(hqlReq);
		query.setParameter("nom1", client.getNom());
		query.setParameter("prenom1", client.getPrenom());
		query.setParameter("cp1", client.getCodePostal());
		query.setParameter("adresse1", client.getAdresse());
		query.setParameter("ville1", client.getVille());
		query.setParameter("telephone1", client.getTelephone());	
		query.setParameter("id1", client.getId());
		query.executeUpdate();
		
	}

	@Override
	public Client afficherClientParId(int idClient) {
		
		Session session = sessionFactory.getCurrentSession();
		String sqlReq="select * from clients  where id =:id1 ";
		SQLQuery query=session.createSQLQuery(sqlReq);
		query.addEntity(Client.class);
		query.setParameter("id1", idClient);
		return (Client) query.uniqueResult();
	}

}
