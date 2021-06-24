package orgexample_spring_demo;

import orgexample_spring_demo.model.InternationCD;
import orgexample_spring_demo.model.SpecialEditionCD;
import orgexample_spring_demo.model.Coach;
import orgexample_spring_demo.model.CricketCoach;
import orgexample_spring_demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach theCoach=context.getBean("theCoach",Coach.class);
			 * System.out.println(theCoach.getDailyworkOut()); Coach
			 * theCoach2=context.getBean("theCoach",Coach.class);
			 * System.out.println(theCoach==theCoach2);
			 * 
			 * 
			 * InternationalCD cd = context.getBean("theCD", InternationalCD.class);
			 * System.out.println(cd.getDetails()); cd.setCdId(101);
			 * cd.setCdName("Godzila"); cd.setLanguage("Russian");
			 * System.out.println(cd.getDetails()); SpecialEditionCD
			 * cd1=context.getBean("theCD1",SpecialEditionCD.class);
			 * System.out.println(cd1.getDetails());
			 */
			Coach tempCoach= context.getBean("theCoach",CricketCoach.class);
			System.out.println(tempCoach.getDailyworkOut());
			System.out.println(tempCoach.getDailyFortune());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.printStackTrace();
		}
	}
}











/**
 * Hello world!
 *
 */
//public class App {
//	public static void main(String[] args) {
//		try {
//
//			@SuppressWarnings("resource")
//			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//			/*
//			 * Coach theCoach=context.getBean("theCoach",Coach.class);
//			 * System.out.println(theCoach.getDailyworkOut()); Coach
//			 * theCoach2=context.getBean("theCoach",Coach.class);
//			 * System.out.println(theCoach==theCoach2); Employee
//			 * e=context.getBean("e",Employee.class); System.out.println(e.getEmail());
//			 */
////			InternationCD cd = context.getBean("theCD", InternationCD.class);
////			System.out.println(cd.getDetails());
////			cd.setCdId(101);
////			cd.setCdName("Godzila");
////			cd.setLanguage("Russian");
////			System.out.println(cd.getDetails());
//
//			SpecialEditionCD scd = context.getBean("theCD1", SpecialEditionCD.class);
//			System.out.println(scd.getDetails());
//			scd.setCdId(101);
//			scd.setCdName("Godzila");
//			scd.setSpecialFeature("3D");
//			System.out.println(scd.getDetails());
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//}

//import orgexample_spring_demo.model.Coach;
//import orgexample_spring_demo.model.Employee;
//import org.omg.CORBA.portable.ApplicationException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        try {
//        	
//        	@SuppressWarnings("resource")
//			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//			/*
//			 * Coach theCoach=context.getBean("theCoach",Coach.class);
//			 * System.out.println(theCoach.getDailyWorkOut());
//			 */
//			Employee e=context.getBean("e",Employee.class);
//			System.out.println(e.getEmail());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    }
//}
