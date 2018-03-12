package lt.vtvpmc.ernestaduglas.spring.repository;

import java.util.List;

import lt.vtvpmc.ernestaduglas.spring.model.User;

public interface UserRepositoryCustom {

	List <User> getAllUsers();
	void addUser(User user);
	void deleteUser(Long id);
	void updateUser(Long id, User user);
}
