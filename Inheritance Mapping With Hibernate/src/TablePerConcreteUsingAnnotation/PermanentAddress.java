package TablePerConcreteUsingAnnotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PerAddress102")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))})
public class PermanentAddress extends Employee {
private String pstreet;
private String plocation;
public String getPstreet() {
	return pstreet;
}
public void setPstreet(String pstreet) {
	this.pstreet = pstreet;
}
public String getPlocation() {
	return plocation;
}
public void setPlocation(String plocation) {
	this.plocation = plocation;
}


}
