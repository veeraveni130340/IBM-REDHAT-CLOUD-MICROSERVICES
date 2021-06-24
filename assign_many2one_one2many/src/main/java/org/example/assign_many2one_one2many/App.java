package org.example.assign_many2one_one2many;



import org.example.assign_demo.Student;
import org.example.assign_demo.University;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Configuration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(University.class).addAnnotatedClass(Student.class).buildSessionFactory();
				
    	   
    	  Session session=factory.getCurrentSession();
    	  
    	 University u=new University();
    	 u.setCountry("india");
    	 u.setName("RGUKT");
    	 session.getTransaction().begin();
    	 
    	 Student s=new Student();
    	 s.setFirstName("vinitha");
    	 s.setLastName("d");
    	 s.setSection("A");
    	 u.add(s);
    	 
    	 Student s2=new Student();
    	 s2.setFirstName("preethi");
    	 s2.setLastName("d");
    	 s2.setSection("B");
    	 u.add(s2);
    	 session.persist(u);
    	 
    	 session.getTransaction().commit();
    	 System.out.println("done");
    	 
    	  
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
