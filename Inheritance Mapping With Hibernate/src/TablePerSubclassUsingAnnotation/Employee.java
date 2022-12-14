package TablePerSubclassUsingAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee103")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="name")
private String ename;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

}
