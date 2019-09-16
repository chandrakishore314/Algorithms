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
	
}
