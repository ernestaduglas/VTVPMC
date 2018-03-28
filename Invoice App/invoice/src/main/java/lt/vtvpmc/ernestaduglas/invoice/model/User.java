package lt.vtvpmc.ernestaduglas.invoice.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class User{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	@NotNull
	String username;
	@NotNull
	String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	public User(@NotNull String username, @NotNull String password, Role role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public User(@NotNull String username, @NotNull String password) {
		this.username = username;
		this.password = password;
	}
	public User() {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
