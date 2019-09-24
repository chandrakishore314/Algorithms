package org.bridgelabz.fundoonotes.repository;

import java.util.List;
import javax.persistence.EntityManager;

import org.bridgelabz.fundoonotes.controller.SpringBootController;
import org.bridgelabz.fundoonotes.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private EntityManager entityManager;
	private static final Logger LOGGER = Logger.getLogger(SpringBootController.class.getName());
	@Override
	public void save(User user) {
		System.out.println(" entered into service controller "); 
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(user);
	}

	@Override
	public List<User> getListOfUsers() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> query = currentSession.createQuery("from User", User.class);
		List<User> list = query.getResultList();
		System.out.println("list of userdetails  " + list);
		return list;
	}

	/*
	 * public int getId(String email) { Session currentSession =
	 * entityManager.unwrap(Session.class); Query query =
	 * currentSession.createQuery(" from User WHERE username=:email");
	 * query.setParameter("email", email); int id = query.getFirstResult();
	 * System.out.println("id from the Db"); return id; }
	 */

	@Override
	public void updateVerify(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		String qryString3 = "update User set isverified=true where id=:sId";
		Query query3 = currentSession.createQuery(qryString3);
		query3.setParameter("sId", id);
		query3.executeUpdate();
	}

	@Override
	public void updatePassword(int id, String password) {
		Session currentSession = entityManager.unwrap(Session.class);
		String qryString3 = "update User set password=:password where id=:sId";
		Query query3 = currentSession.createQuery(qryString3);
		query3.setParameter("sId", id);
		query3.setParameter("password", password);
		query3.executeUpdate();
	}

	@Override
	public List<User> getUserDetails(String email) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery(" from User WHERE email=:email");
		LOGGER.info("entered into service to fetch the data based on email");
		query.setParameter("email", email);
		List<User> userdata=  query.getResultList();
		return userdata;
	}

}
