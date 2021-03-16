package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Admin extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="admin")
	private List<Ad> ads;
	
	@OneToMany(mappedBy="admin")
	private List<Event> event;
	//@OneToMany(mappedBy="admin")
	//List<Accounting> accounting;
   private int rib;
   private String dicForbiddenWords;
   private float salary;
public int getRib() {
	return rib;
}
public void setRib(int rib) {
	this.rib = rib;
}
public String getDicForbiddenWords() {
	return dicForbiddenWords;
}
public void setDicForbiddenWords(String dicForbiddenWords) {
	this.dicForbiddenWords = dicForbiddenWords;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

}
