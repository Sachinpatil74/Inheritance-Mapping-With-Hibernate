package TablePerHierarchyusingxml;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmpDetails {

	public static void main(String[] args) {
		Session session=new Configuration().configure("TablePerHierarchyusingxml/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		//Empployee Object Creation
		
		Employee e=new Employee();
		e.setNameEmail("sachin@gmail.com");
		e.setAddress("housing");
		
		//Address creation
		
		Address ad=new Address();
		ad.setNameEmail("rahul@gmail.com");
		ad.setStreet("pithampur arera");
		ad.setLocation("Indore");
		
		//PerAddress creation
		
		PermanentAddress p=new PermanentAddress();
		p.setNameEmail("neha@gmail.com");
		p.setPerStreet("a/e 602 housing board");
		p.setPerLocation("Madhya");
		
		session.save(e);
		session.save(ad);
		session.save(p);
		
		tx.commit();
		session.close();
		System.out.println("Success");
	}

}
