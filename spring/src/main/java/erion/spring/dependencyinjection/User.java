package erion.spring.dependencyinjection;

public class User {
	
	private Role role;
	
	public User() {
		
	}
	
	public User(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return this.role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}

}
