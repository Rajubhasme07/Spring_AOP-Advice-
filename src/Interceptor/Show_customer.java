package Interceptor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Show_customer {
	
	public static void main(String [] agrs){
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Customer customer=(Customer) factory.getBean("proxy");
		customer.c();
	}

}
