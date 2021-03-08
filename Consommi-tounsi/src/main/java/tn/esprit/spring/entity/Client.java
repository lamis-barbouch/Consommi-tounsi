package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Client extends User  {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(mappedBy="client")
	List<Fund> funds;
	@ManyToMany(mappedBy="client")
	List<SubjectForum> subjectforum;
	//@OneToMany(mappedBy="client")
	//List<Order> order;
	@ManyToMany(mappedBy="client")
	
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
