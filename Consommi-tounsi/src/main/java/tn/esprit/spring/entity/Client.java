package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Client extends User  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(mappedBy="client")
	List<Fund> funds;
	
	@ManyToMany(mappedBy="listclient")
	private List<Event> listevent;
	
	@OneToMany(mappedBy="client")
	private List<Comment> comment;

	//@OneToMany(mappedBy="client")
	//List<Order> order;

	
	private String address;
	private String city;
	@ManyToMany(mappedBy="listclient")
	private List<SubjectForum> listsubjectforum;
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
