package erion.spring.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class User3 {
	
	private RoleInterface role;
	
	public User3() {
		
	}
	
	public User3(RoleInterface role) {
		this.role = role;
	}

	public RoleInterface getRole() {
		return this.role;
	}
	
	@Autowired
	public void setRole(RoleInterface role) {
		this.role = role;
	}

}
