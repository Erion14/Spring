package erion.spring.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig {
	
	@Bean
	public Role adminRole() {
		return new Role("ADMIN_ROLE");
	}
	
	@Bean
	public User adminUser() {
		return new User(adminRole());
	}
	
	@Bean
	public User adminUser2() {
		User user = new User();
		user.setRole(adminRole());
		return user;
	}
	

}
