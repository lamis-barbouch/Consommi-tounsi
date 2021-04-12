
package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CascadeType;
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
	@OneToMany(mappedBy="delivery")
	private List<Order> order;
	
	
		public List<Order> getOrder() {
	return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

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

@OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
	private Set<Order> Orders;
}
package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Delivery")

public class Delivery implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_delivery;
	@Enumerated(EnumType.STRING)
	private DeliveryZone delivery_zone;
	private Date date_delivery;
	@Enumerated(EnumType.STRING)
	private StatusOrder status_order;
	
	
	public StatusOrder getStatus_order() {
		return status_order;
	}


	public void setStatus_order(StatusOrder status_order) {
		this.status_order = status_order;
	}


	public Date getDate_delivery() {
		return date_delivery;
	}


	public void setDate_delivery(Date date_delivery) {
		this.date_delivery = date_delivery;
	}


	public DeliveryZone getDelivery_zone() {
		return delivery_zone;
	}


	public void setDelivery_zone(DeliveryZone delivery_zone) {
		this.delivery_zone = delivery_zone;
	}
	@ManyToOne
	private DeliveryMan deliveryman;
	
	
	public DeliveryMan getDeliveryman() {
		return deliveryman;
	}


	public void setDeliveryman(DeliveryMan deliveryman) {
		this.deliveryman = deliveryman;
		
	}
	@OneToOne
	@JoinColumn(name = "id_order")
	private OrderMouna Order;


	public OrderMouna getOrder() {
		return Order;
	}


	public void setOrder(OrderMouna order) {
		Order = order;
	}


	public int getId_delivery() {
		return id_delivery;
	}


	public void setId_delivery(int id_delivery) {
		this.id_delivery = id_delivery;
	}


	public Delivery() {
		super();
		
		
	}

}
