package TablePerSubclassUsingAnnotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDetails {

	public static void main(String[] args) {
	Session session=new Configuration().configure("TablePerSubclassUsingAnnotation/hibernate.cfg.xml").buildSessionFactory().openSession();
    Transaction tx=session.beginTransaction();    
    
    Employee e=new Employee();
    e.setEname("vivek");
    
    RegularEmp r=new RegularEmp();
    r.setEname("gaurav");
    r.setBonus(5);
    r.setSalary(50000);

    ContractEmp c= new ContractEmp();
    c.setEname("Arjun");
    c.setContractduration("15 hour");
    c.setPayperhour(1000);
    
    session.save(e);
    session.save(r);
    session.save(c);
    
    tx.commit();
    session.close();
    System.out.println("Sucessfully done ");
	}

}
