package lt.vtvpmc.ernestaduglas.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lt.vtvpmc.ernestaduglas.invoice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("Select u from User u where u.username =?1")
	User findUserByUsername(String username);
}