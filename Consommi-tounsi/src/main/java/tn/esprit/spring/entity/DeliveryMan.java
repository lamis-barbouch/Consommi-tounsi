package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DeliveryMan extends User  {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@OneToMany(mappedBy="deliveryman") 
    private int id_user;

	private int rating_deliveryMan;
	private int cin;
	private String address;
	private long salary;
	private float bonus;
	private String city;
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
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
	public DeliveryMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	

}