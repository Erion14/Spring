package erion.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("variantProductBean")
public class VariantProduct implements Product{

}
