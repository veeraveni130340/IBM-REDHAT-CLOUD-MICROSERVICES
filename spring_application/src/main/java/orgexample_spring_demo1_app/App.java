package orgexample_spring_demo1_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orgexample_spring_demo.model.SpecialEditionCD;
import orgexample_spring_demo1.MyDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		//MyDetails cd=context.getBean("theCD", MyDetails.class);
    		//System.out.println(cd.getDetails());
    		MyDetails cd1=context.getBean("theCD1", MyDetails.class);
    		System.out.println(cd1.getDetails());
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
    }
}