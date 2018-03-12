package lt.vtvpmc.ernestaduglas.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.spring.model.User;
import lt.vtvpmc.ernestaduglas.spring.service.UserService;

@RestController
@RequestMapping(value = "api/users")
public class UserController {
	private UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	
	@RequestMapping(path = "/oldest", method = RequestMethod.GET)
	public List<User> findOldestUser() {
		return service.findOldestUser();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		service.addUser(user);

	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable Long id, @RequestBody User user) {
		service.updateUser(id, user);
	}
	
	@RequestMapping(path = "/{name}/{surname}", method = RequestMethod.GET)
	public List<User> findUserByNameAndSurname(@PathVariable String name, @PathVariable String surname) {
		return service.findUserByNameAndSurname(name, surname);
	}
	
	
	
	
	
	

}
