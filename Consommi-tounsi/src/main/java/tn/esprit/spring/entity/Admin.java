package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

<<<<<<< HEAD
public class Admin extends User
{
	@OneToMany(mappedBy="admin")
	List<Ad> ads;
=======
@Entity
public class Admin extends User {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_user;
	
>>>>>>> branch 'main' of https://github.com/lamis-barbouch/Consommi-tounsi.git
	//@OneToMany(mappedBy="admin")
<<<<<<< HEAD
	//List<Event> event;
	@OneToMany(mappedBy="admin")
	List<Accounting> accounting;
	List<DeliveryMan> deliverymens;
=======
	//private List<Ad> ads;
	
	@OneToMany(mappedBy="admin")
	private List<Event> event;
	//@OneToMany(mappedBy="admin")
	//List<Accounting> accounting;
>>>>>>> branch 'main' of https://github.com/lamis-barbouch/Consommi-tounsi.git
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
