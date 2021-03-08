package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Client extends User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
