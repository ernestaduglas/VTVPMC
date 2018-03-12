package lt.vtvpmc.ernestaduglas.spring.service;

import java.util.List;

import lt.vtvpmc.ernestaduglas.spring.model.User;

public interface UserService {
	
	List <User> getAllUsers();
	void addUser(User user);
	void deleteUser(Long id);
	void updateUser(Long id, User user);
	List <User> findUserByNameAndSurname(String name, String surname);
	List<User> findOldestUser();
	
	
	

}
