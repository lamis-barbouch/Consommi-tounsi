package tn.esprit.spring.entity;

import javax.persistence.Entity;

@Entity
public class Client extends User {
	private String address;
	private String city;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
