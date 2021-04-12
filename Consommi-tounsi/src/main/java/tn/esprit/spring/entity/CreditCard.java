package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CreditCard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long card_number;
	private String name;
	private Date expiration_date;
	private long cvv;

	public long getCard_number() {
		return card_number;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public long getCvv() {
		return cvv;
	}
	public void setCvv(long cvv) {
		this.cvv = cvv;
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@OneToMany(cascade = CascadeType.ALL, mappedBy="creditcard")
	//private Set<Order> Orders;	

}
