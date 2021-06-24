package orgexample_spring_demo2.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import orgexample_spring_demo2.Customer;

public class App {
	public static void main(String[] args) {
		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Customer customer=context.getBean("theCustomer",Customer.class);
			System.out.println(customer);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.printStackTrace();
		}
	}
}