package org.bridgelabz.application.repository;

import java.util.List;

import org.bridgelabz.application.model.User;

public interface UserRepository {
	
void save(User user);
List<User> getListOfUsers();
	
}
