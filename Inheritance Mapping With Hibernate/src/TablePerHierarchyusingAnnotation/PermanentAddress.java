package TablePerHierarchyusingAnnotation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("PerAddress")  
public class PermanentAddress extends Employee {
	private String perStreet;
	private String perLocation;
	public String getPerStreet() {
		return perStreet;
	}
	public void setPerStreet(String perStreet) {
		this.perStreet = perStreet;
	}
	public String getPerLocation() {
		return perLocation;
	}
	public void setPerLocation(String perLocation) {
		this.perLocation = perLocation;
	}
	
}
