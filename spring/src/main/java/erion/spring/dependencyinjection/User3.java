package erion.spring.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User3 {

//	@Autowired(required = false)
	private RoleInterface role;
	
	public User3() {
	}
	
//	@Autowired
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
