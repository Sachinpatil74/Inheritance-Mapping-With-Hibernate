package TablePerSubclassUsingxml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDetails {

	public static void main(String[] args) {
		Session session=new Configuration().configure("TablePerSubclassUsingXml/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("rishi");
		
		
		RegularEmp r=new RegularEmp();
		r.setName("vicky");
		r.setSalary(50000);
		r.setBonus(5);
		
		ContractEmp c=new ContractEmp();
		c.setName("arjun");
		c.setContractduration("15 hours");
		c.setPayperhour(1000);
		
		session.persist("e");
		session.persist(r);
		session.persist(c);
		
		tx.commit();
		session.close();
		System.out.println("Successfully Done ");

	}

}
