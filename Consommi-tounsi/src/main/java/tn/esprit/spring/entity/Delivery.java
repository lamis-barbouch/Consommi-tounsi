package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;
//import java.util.Set;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;


@Entity
@Table(name = "Delivery")
public class Delivery implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_delivery;
	
	private double fees;
	
	private String type;
	//@OneToMany(mappedBy="delivery")
	// private List<Order> order;
	
	
	
//	public List<Order> getOrder() {
//		return order;
//	}
//
//	public void setOrder(List<Order> order) {
//		this.order = order;
//	}

	public Delivery(int id_delivery, double fees, String type) {
		super();
		this.id_delivery = id_delivery;
		this.fees = fees;
		this.type = type;
	}
	
	public Delivery() {
		super();
	}

	public int getId() {
		return id_delivery;
	}

	public void setId(int id_delivery) {
		this.id_delivery = id_delivery;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
//
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
//	private Set<Order> Orders;
}
