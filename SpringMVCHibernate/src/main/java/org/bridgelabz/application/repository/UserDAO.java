package org.bridgelabz.application.repository;

import javax.transaction.Transactional;

import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class UserDAO {
	@Autowired
    private SessionFactory sessionFactory;

	public int loginUser(Login login) {
		int count = 0;
		Student student	=(Student) sessionFactory.getCurrentSession().get(
                Student.class, login.getUserName());
		System.out.println(" student data in dao");
		if(student.getUserName().equals(null)) {
			 count=0;	
		}
		else {
			count=1;
		}
		return count;
	}

	public int saveUser(Student student) {
		Session session = sessionFactory.getCurrentSession();
	        session.persist(student);
		return 1;
	}

}
