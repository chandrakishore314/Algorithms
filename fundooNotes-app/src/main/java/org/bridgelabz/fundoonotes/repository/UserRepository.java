package org.bridgelabz.fundoonotes.repository;

import java.util.List;

import org.bridgelabz.fundoonotes.model.User;

public interface UserRepository {

	void save(User user);

	List<User> getListOfUsers();

	//int getId(String email);

	void updateVerify(int id);

	void updatePassword(int id, String password);

	List<User> getUserDetails(String email);

}
