package lt.vtvpmc.ernestaduglas.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ernestaduglas.spring.model.User;
import lt.vtvpmc.ernestaduglas.spring.repository.UserRepository;

@Service
public class DBUserService implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Transactional(readOnly = true)
	@Override
	public List<User> getAllUsers() {
		//return repo.getAllUsers();
		return repo.findAll();
	}

	@Transactional
	@Override
	public void addUser(User user) {
		//repo.addUser(user);
		repo.save(user);

	}

	@Transactional
	@Override
	public void deleteUser(Long id) {
		//repo.deleteUser(id);
		repo.deleteById(id);
	}
	
	@Transactional
	@Override
	public void updateUser(Long id, User user) {
		//repo.updateUser(id, user);
		repo.save(user);

	}
	@Transactional
	@Override
	public List <User> findUserByNameAndSurname(String name, String surname) {
		return repo.findUserByNameAndSurname(name, surname);
	}
	
	@Transactional
	@Override
	public List<User> findOldestUser() {
		return repo.findOldestUser();
	}

}
