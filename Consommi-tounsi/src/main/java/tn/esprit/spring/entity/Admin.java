package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity

public class Admin extends User {
	
   private int rib;
   private String dicForbiddenWords;
   private float salary;

}
