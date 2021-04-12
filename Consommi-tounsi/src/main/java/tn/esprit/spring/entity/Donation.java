package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Donation implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_donation;
	@OneToOne(mappedBy="donation")
	private Cart cart;
	
	public int getId_donation() {
		return id_donation;
	}
	public void setId_donation(int id_donation) {
		this.id_donation = id_donation;
	}
	public Donation(int id_donation) {
		super();
		this.id_donation = id_donation;
	}
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donation [id_donation=" + id_donation + ", cart=" + cart + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_donation;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Donation other = (Donation) obj;
		if (id_donation != other.id_donation)
			return false;
		return true;
	}
	public Donation(int id_donation, Cart cart) {
		super();
		this.id_donation = id_donation;
		this.cart = cart;
	}
	public Donation(Cart cart) {
		super();
		this.cart = cart;
	}
	
}
