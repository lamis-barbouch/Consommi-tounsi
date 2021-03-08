package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity

public class Admin extends User {
	
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
