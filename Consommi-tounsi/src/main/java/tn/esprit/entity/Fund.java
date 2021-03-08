package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Fund implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_fund;
	//float
	private float amount;
	public int getId_fund() {
		return id_fund;
	}
	public void setId_fund(int id_fund) {
		this.id_fund = id_fund;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
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
	
	
}
