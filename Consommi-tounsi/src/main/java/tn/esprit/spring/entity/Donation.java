package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	
}
