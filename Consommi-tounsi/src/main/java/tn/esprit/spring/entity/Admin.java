package tn.esprit.spring.entity;

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
	@GeneratedValue(strategy=GenerationType.TABLE)
    private int id_user;
	
	//@OneToMany(mappedBy="admin")
	//private List<Ad> ad;

@OneToMany(mappedBy="admin")
	private List<Event> event;
    private int rib;

   public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
}
public List<Event> getEvent() {
	return event;
}
public void setEvent(List<Event> event) {
	this.event = event;
}
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
public static long getSerialversionuid() {
	return serialVersionUID;
}
private String dicForbiddenWords;
   private float salary;


}
