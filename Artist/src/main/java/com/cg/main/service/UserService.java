package com.cg.main.service;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.Composer;
import com.cg.main.entities.User;
import com.cg.main.repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {

		return userRepository.save(user);
	}

	/*
	 * public User getUser(int user_id) { if (ValiadateUser_id(user_id)) return
	 * userRepository.getOne(user_id); else return null; }
	 */
	/*
	 * private boolean ValiadateUser_id(int user_id) { User user =
	 * userRepository.findOne(user_id); if (user != null) return true; else return
	 * false; }
	 */

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
	  public User updateUser(int user_id, User user) {
	  
	  User useradded = userRepository.save(user); 
	  
	  return userRepository.save(useradded); }
	 
	

	/*
	 * public void deleteUserDetails(int user_id) { if (ValiadateUser_id(user_id))
	 * userRepository.delete(user_id);
	 * 
	 * 
	 * }
	 */

	

}
