package lt.vtvpmc.ernestaduglas.spring.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lt.vtvpmc.ernestaduglas.spring.model.User;

//@Repository
public class DBUserRepository implements UserRepositoryCustom {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<User> getAllUsers() {
		return manager.createQuery("SELECT u from User u", User.class).getResultList();
	}

	@Override
	public void addUser(User user) {
		manager.persist(user);

	}

	@Override
	public void deleteUser(Long id) {
		User user = manager.createQuery("SELECT u from User u where id = :id", User.class).setParameter("id", id)
				.getSingleResult();
		if (manager.contains(user)) {
			manager.remove(user);
		}
	}

	@Override
	public void updateUser(Long id, User user) {
		User existingUser =  manager.createQuery("SELECT u from User u where id = :id", User.class).setParameter("id", id)
				.getSingleResult();
		if(existingUser != null) {
			existingUser.setName(user.getName()); 
			existingUser.setSurname(user.getSurname());
			manager.merge(existingUser);	
		}
	}

}
