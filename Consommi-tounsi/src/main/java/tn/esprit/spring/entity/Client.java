package tn.esprit.spring.entity;

import javax.persistence.Entity;

@Entity
public class Client extends User {
	private String address;
	private String city;

}
