package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Admin extends User
{
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_user;
	
	//@OneToMany(mappedBy="admin")
	//private List<Ad> ad;


	private List<Event> event;
	
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
