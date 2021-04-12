package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
 
public class Order implements Serializable{
	
//
///**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_order;
//private Date date_order;
//private Date date_delivery;
//private double fees;
//private double sum;
//private String destination;
//private String methodPayment;
//private boolean status;
//
//
//public int getId_order() {
//	return id_order;
//}
//public void setId_order(int id_order) {
//	this.id_order = id_order;
//}
//public Date getDate_order() {
//	return date_order;
//}
//public void setDate_order(Date date_order) {
//	this.date_order = date_order;
//}
//public Date getDate_delivery() {
//	return date_delivery;
//}
//public void setDate_delivery(Date date_delivery) {
//	this.date_delivery = date_delivery;
//}
//public double getFees() {
//	return fees;
//}
//public void setFees(double fees) {
//	this.fees = fees;
//}
//public double getSum() {
//	return sum;
//}
//public void setSum(double sum) {
//	this.sum = sum;
//}
//public String getDestination() {
//	return destination;
//}
//public void setDestination(String destination) {
//	this.destination = destination;
//}
//public String getMethodPayment() {
//	return methodPayment;
//}
//public void setMethodPayment(String methodPayment) {
//	this.methodPayment = methodPayment;
//}
//public boolean isStatus() {
//	return status;
//}
//public void setStatus(boolean status) {
//	this.status = status;
//}
//public Order() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//
//@ManyToOne 
//private DeliveryMan deliveryman; 
//@ManyToOne
//private Client client;
//@ManyToOne
//private CreditCard creditcard;
//@ManyToOne 
//private Delivery delivery;
//@OneToOne
//private Cart cart;
//
//
//

}
