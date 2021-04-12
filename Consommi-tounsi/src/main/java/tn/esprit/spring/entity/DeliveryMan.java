
package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DeliveryMan extends User  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_user;

	private int rating_deliveryMan;
	private int cin;
	private String address;
	private float salary;
	private float bonus;
	private String city;
	private boolean actived;

	//@OneToMany(mappedBy="deliveryman")

	//@OneToMany(mappedBy="deliveryman")
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy="deliveryman")
	//private Set<Order> Orders;
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public int getRating_deliveryMan() {
		return rating_deliveryMan;
	}
	public void setRating_deliveryMan(int rating_deliveryMan) {
		this.rating_deliveryMan = rating_deliveryMan;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public DeliveryMan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public DeliveryMan(int id_user, List<Complaint> complaints, String first_name, String last_name, int phone_number,
			String email, String password, String gender, String username, Date date, int id_user2,
			int rating_deliveryMan, int cin, String address, float salary, float bonus, String city,
			Set<Order> orders) {
		super(id_user, complaints, first_name, last_name, phone_number, email, password, gender, username, date);
		this.rating_deliveryMan = rating_deliveryMan;
		this.cin = cin;
		this.address = address;
		this.salary = salary;
		this.bonus = bonus;
		this.city = city;
		//Orders = orders;
	}
	

}
