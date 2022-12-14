package TablePerConcreteUsingAnnotation;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDetails {

	public static void main(String[] args) {
		Session session=new Configuration().configure("TablePerConcreteUsingAnnotation/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setId(101);
		e.setName("sachin");
		
		Address ad=new Address();
		ad.setName("rahul");
		ad.setLocation("indore");
		ad.setStreet("ae 602 mhow");
		
		PermanentAddress p=new PermanentAddress();
		p.setName("neha");
		p.setPstreet("ae 405 mhow");
		p.setPlocation("delhi");
		
		session.save(e);
		session.save(ad);
		session.save(p);
	    t.commit();
	    session.close();
	    System.out.println("Succesfully Done");

	}

}
