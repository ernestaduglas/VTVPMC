package lt.vtvpmc.ernestaduglas.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.vtvpmc.ernestaduglas.spring.model.User;
import lt.vtvpmc.ernestaduglas.spring.service.UserService;

@Component
public class UserDataInput implements CommandLineRunner {
	private UserService service;

	@Autowired
	public UserDataInput(UserService service) {
		this.service = service;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		 service.addUser(new User("John", "Petterson", 56));
		 service.addUser(new User("Mary", "Johnson", 36));
		 service.addUser(new User("Tom", "Adams", 40));
		 service.addUser(new User("Jane", "Clare", 56));
	}
	
}

	