package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fund implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_fund;
	private double amount;
	@Temporal(TemporalType.DATE)
	private Date date_fund;
	@OneToOne(mappedBy="fund")
	private Event event;
	
	public int getId_fund() {
		return id_fund;
	}
	public Date getDate_fund() {
		return date_fund;
	}
	public void setDate_fund(Date date_fund) {
		this.date_fund = date_fund;
	}
	
	public void setId_fund(int id_fund) {
		this.id_fund = id_fund;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Fund() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fund(int id_fund, float amount) {
		super();
		this.id_fund = id_fund;
		this.amount = amount;
	}
	public Fund(int id_fund, double amount, Date date_fund) {
		super();
		this.id_fund = id_fund;
		this.amount = amount;
		this.date_fund = date_fund;
		
	}
	public Fund( double amount, Date date_fund) {
		super();
		this.amount = amount;
		this.date_fund = date_fund;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_fund;
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
		Fund other = (Fund) obj;
		if (id_fund != other.id_fund)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Fund [id_fund=" + id_fund + ", amount=" + amount + ", date_fund=" + date_fund + ", event=" + event
				+ "]";
	}
	
	
	
}
