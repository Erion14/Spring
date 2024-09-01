package erion.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplicationContextAnnotations {
	
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext();
		context.scan("erion.spring");
		context.refresh();
		
		User2 user = context.getBean("user", User2.class);
		System.out.println(user);
		
		User2 user2 = context.getBean("user2", User2.class);
		User2 user3 = context.getBean("customUser", User2.class);
		System.out.println(user2);
		System.out.println(user3);
		
		Product variantProduct = context.getBean("variantProduct", Product.class);
		Product masterProduct = context.getBean("masterProduct", Product.class);
		System.out.println(variantProduct.getClass().getName());
		System.out.println(masterProduct.getClass().getName());
		
		SpecialOffer specialOffer = context.getBean("specialOffer", SpecialOffer.class);
		System.out.println("Master Product = " + specialOffer.getMasterProduct().getClass().getName());
		System.out.println("Variant Product = " + specialOffer.getVariantProduct().getClass().getName());
	}

}
