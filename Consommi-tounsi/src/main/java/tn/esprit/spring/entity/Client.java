package tn.esprit.spring.entity;

import java.util.Date;
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
	private boolean actived;

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	private String city;
	@ManyToMany(mappedBy="listclient")
	private List<Event> listevent;
	
	@OneToMany(mappedBy="client")
	private List<Comment> comment;

<<<<<<< main
	public Client() {
		super();
		// TODO Auto-generated constructor stub
=======
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")

	private List<OrderMouna>orderm ;
	
	
	
	public List<OrderMouna> getOrderm() {
		return orderm;
>>>>>>> 58f61a5 Fixing the loops and starting the Crud of poduct
	}
<<<<<<< main
=======
	public void setOrderm(List<OrderMouna> orderm) {
		this.orderm = orderm;
>>>>>>> 58f61a5 Fixing the loops and starting the Crud of poduct

	public Client(int id_user, List<Complaint> complaints, String first_name, String last_name, int phone_number,
			String email, String password, String gender, String username, Date date, String address, String city, List<Event> listevent, List<Comment> comment,
			List<Order> order, List<SubjectForum> listsubjectforum) {
		super(id_user, complaints, first_name,last_name, phone_number,email,password,  gender,username, date);
		//this.id_user = id_user;
		
		this.address = address;
		this.city = city;
		this.listevent = listevent;
		this.comment = comment;
		//this.order = order;
		this.listsubjectforum = listsubjectforum;
	}
	
	//@OneToMany(mappedBy="client")
	//List<Order> order;
    
	//public List<Order> getOrder() {
		//return order;
	//}
	//public void setOrder(List<Order> order) {
		//this.order = order;
	//}
	@ManyToMany(mappedBy="listclient")
	private List<SubjectForum> listsubjectforum;
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
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
	
	
}
