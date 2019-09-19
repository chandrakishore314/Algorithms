package org.bridgelabz.application.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.bridgelabz.application.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private EntityManager entityManager;
	
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
		System.out.println("list of userdetails  "+ list);
		return list;
	}

public  List<User> getId(String email) {
	Session currentSession = entityManager.unwrap(Session.class);
	  Query query =  currentSession.createQuery(" from User WHERE username=:email");
	 query.setParameter("email", email);
	  List<User> list = query.list();
	return list;
}

@Override
public void updateVerify(int id) {
	Session currentSession = entityManager.unwrap(Session.class);
	String qryString3 = "update User set isverified=true where id=:sId";
    Query query3 = currentSession.createQuery(qryString3);
    query3.setParameter("sId", id);
    query3.executeUpdate();
}
	
	
}
