package TablePerHierarchyusingAnnotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeDetails {

	public static void main(String[] args) {
		Session session=new Configuration().configure("TablePerHierarchyusingAnnotation/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		//Empployee Object Creation
		
		Employee e=new Employee();
		e.setEmployeeId(112);
		e.setNameEmail("rahul@gmail.com");
		e.setAddress("mhow");
		
		//Address creation
		
		Address ad=new Address();
		ad.setStreet("pithampur arera");
		ad.setLocation("Indore");
		
		//PerAddress creation
		
		PermanentAddress p=new PermanentAddress();
		p.setPerStreet("a/e 603 housing board");
		p.setPerLocation("Madhya");
		
		session.save(e);
		session.save(ad);
		session.save(p);
		
		tx.commit();
		session.close();
		System.out.println("Success");
	}




	}


