package com.cg.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.entities.MusicSociety;
import com.cg.main.entities.User;
import com.cg.main.exception.ArtistException;
import com.cg.main.service.MusicSocietyService;
import com.cg.main.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/user/{user_id}")    
	public User getUserDetails(@PathVariable User user_id) throws Exception {
	return userService.addUser(user_id);}   

	@RequestMapping("/user")    
	public List<User> getAllComposer() throws Exception {
	return userService.getAllUsers();
		} 
		
	@RequestMapping(method= RequestMethod.POST, value="/user")
	public ResponseEntity<User> addComposer(@RequestBody User user) throws Exception {
		User useradded = userService.addUser(user);
		
			return new ResponseEntity<User>(useradded, HttpStatus.OK);

		}

	/*
	 * @RequestMapping(method= RequestMethod.DELETE, value ="/customer/{accNo}")
	 * public void deleteCustomer(@PathVariable int accNo) throws Exception {
	 * composerService.deleteCustomer(accNo); }
	 */
	@RequestMapping(method= RequestMethod.PUT, value ="/user/{user_id}" )
	public User updateUser(@RequestBody User user, @PathVariable int user_id) throws ArtistException {
		return userService.updateUser(user_id, user);
		}
	
	@Autowired
	private MusicSocietyService musicSocietyService;

	@RequestMapping("/music")    
	public MusicSociety getMusicSocietyDetails(@PathVariable MusicSociety Composer_MusicSocietyID) throws ArtistException {
	return musicSocietyService.addMusicSociety(Composer_MusicSocietyID);}   

}
