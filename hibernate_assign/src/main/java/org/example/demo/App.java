package org.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.example.demo.model.Address;
import org.example.demo.model.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	Logger logger=Logger.getLogger("org.demo.address_mapping.App.class");
    	try {
    		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).addAnnotatedClass(Address.class).buildSessionFactory();
    		Session session=factory.getCurrentSession();
    		
    		Users user=new Users();
    		Address address=new Address();
    		user.setUsename("vinitha");
    		address.setStreet("narayana puram");
    		address.setCity("rajahmundry");
    		user.setAddressDetails(address);
    		address.setUserDetails(user);
    		
    		session.getTransaction().begin();
    		session.persist(address);
    		session.persist(user);
    		session.getTransaction().commit();
    		logger.info("Done!");
//    		
//    		 For Display
//     	   session=factory.openSession();
//       List<Users> list=new ArrayList<Users>();
//       Query query=session.createQuery("Select e from users e");
//       
//       list=query.getResultList();
//       Iterator<Users> i=list.iterator();
//       while(i.hasNext())
//     	  {
//     	  System.out.println(i.next());
//        }
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
