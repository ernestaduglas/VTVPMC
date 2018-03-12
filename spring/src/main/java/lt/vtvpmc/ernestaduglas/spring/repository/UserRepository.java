package lt.vtvpmc.ernestaduglas.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lt.vtvpmc.ernestaduglas.spring.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	@Query("select u from User u where u.name = ?1 and u.surname = ?2")
	List<User> findUserByNameAndSurname(String name, String surname);
	
	@Query("select u from User u where u.age = (select max(u.age) from User u)")
	List<User> findOldestUser();

}
