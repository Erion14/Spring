package erion.spring.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User2 {
	
	@Autowired
	private Role role;
	
	public Role getRole() {
		return this.role;
	}

}
