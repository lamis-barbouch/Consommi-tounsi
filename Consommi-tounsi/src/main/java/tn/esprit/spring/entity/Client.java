package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Client extends User  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
    private int id_user;
	private String address;
	private String city;
	
	@OneToMany(mappedBy="client")
	private List<Fund> funds;
	
	@ManyToMany(mappedBy="listclient")
	private List<Event> listevent;
	
	@OneToMany(mappedBy="client")
	private List<Comment> comment;

	//@OneToMany(mappedBy="client")
	//List<Order> order;
    
	@ManyToMany(mappedBy="listclient")
	private List<SubjectForum> listsubjectforum;
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public List<Fund> getFunds() {
		return funds;
	}
	public void setFunds(List<Fund> funds) {
		this.funds = funds;
	}
	public List<Event> getListevent() {
		return listevent;
	}
	public void setListevent(List<Event> listevent) {
		this.listevent = listevent;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public List<SubjectForum> getListsubjectforum() {
		return listsubjectforum;
	}
	public void setListsubjectforum(List<SubjectForum> listsubjectforum) {
		this.listsubjectforum = listsubjectforum;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
