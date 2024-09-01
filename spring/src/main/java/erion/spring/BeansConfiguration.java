package erion.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean
	public User2 user2() {
		var user = new User2();
		user.setFirstName("Erion");
		user.setLastName("Ademi");
		return user;
	}
	
	@Bean("customUser")
	public User2 user3() {
		var user = new User2();
		user.setFirstName("Eri");
		user.setLastName("Ad");
		return user;
	}

}
