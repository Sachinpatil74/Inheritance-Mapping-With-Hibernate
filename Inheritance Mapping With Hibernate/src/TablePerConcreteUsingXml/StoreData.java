package TablePerConcreteUsingXml;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void main(String[] args) {  
  
    Session session=new Configuration().configure("TablePerConcreteUsingXml/hibernate.cfg.xml").buildSessionFactory().openSession();
    
      
    Transaction t=session.beginTransaction();  
      
    Employee e1=new Employee();
    e1.setName("Gaurav Chawla");    
        
    RegularEmployee e2=new RegularEmployee();    
    e2.setName("Vivek Kumar");    
    e2.setSalary(50000);    
    e2.setBonus(5);    
        
    ContactEmployee e3=new ContactEmployee();    
    e3.setName("Arjun kumar");  
    e3.setPay_per_hour(1000);    
    e3.setContract_duration("15 hours");    
        
    session.persist(e1);    
    session.persist(e2);    
    session.persist(e3);    
        
    t.commit();    
    session.close();    
    System.out.println("success");    
}     
}  
