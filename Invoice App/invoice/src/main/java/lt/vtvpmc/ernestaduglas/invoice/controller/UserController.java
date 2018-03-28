package lt.vtvpmc.ernestaduglas.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.invoice.model.User;
import lt.vtvpmc.ernestaduglas.invoice.service.UserService;

//@RestController
@RequestMapping(value = "/login")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void loginUser(@RequestBody User user) {
		userService.loadUserByUsername(user.getUsername());
	}
	
	

}
