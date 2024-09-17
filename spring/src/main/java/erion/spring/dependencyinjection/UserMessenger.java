package erion.spring.dependencyinjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class UserMessenger {
	
	private Message message;
	
	@Lookup
	public Message getMessage() {
		return null;
	}

}
