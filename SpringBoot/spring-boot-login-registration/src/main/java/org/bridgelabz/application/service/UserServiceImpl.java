package org.bridgelabz.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.User;
import org.bridgelabz.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
//To save the user details in the DATABASE
	@Transactional
	public void save(User user) {
		System.out.println(" entered into registration service ");
		 userRepository.save(user);
	}

//To check the User login credentials	
	@Transactional
	public int checkLoginDetails(LoginDTO loginDTO) {
		int count=0;
		List<User>  listofusers=userRepository.getListOfUsers();
		for(User user:listofusers) {
			if(loginDTO.getEmail().equals(user.getEmail()) && loginDTO.getPassword().contentEquals(user.getPassword())) {
				count=1;
			}
		}
		return count;
	}

}
