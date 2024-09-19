package erion.spring.dependencyinjection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MediumPriority implements Priority{

	@Override
	public int getPriorityRank() {
		// TODO Auto-generated method stub
		return 2;
	}

}
