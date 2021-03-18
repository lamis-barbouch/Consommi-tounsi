package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="accounting")
public class Accounting implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_accounting;
	
	@Column(name="income_permonth")
	private float income_permonth;
	
	@Column(name="total_exp")
	private float total_exp;
	
	@Column(name="total_inc")
	private float total_inc;
	
	@Column(name="gain_permonth")
	private float gain_permonth;

	
	
	public Long getId_accounting() {
		return id_accounting;
	}

	public void setId_accounting(Long id_accounting) {
		this.id_accounting = id_accounting;
	}

	public float getIncome_permonth() {
		return income_permonth;
	}

	public void setIncome_permonth(float income_permonth) {
		this.income_permonth = income_permonth;
	}

	public float getTotal_exp() {
		return total_exp;
	}

	public void setTotal_exp(float total_exp) {
		this.total_exp = total_exp;
	}

	public float getTotal_inc() {
		return total_inc;
	}

	public void setTotal_inc(float total_inc) {
		this.total_inc = total_inc;
	}

	public float getGain_permonth() {
		return gain_permonth;
	}

	public void setGain_permonth(float gain_permonth) {
		this.gain_permonth = gain_permonth;
	}

	public Accounting() {
		super();
		// TODO Auto-generated constructor stub
	}
}
