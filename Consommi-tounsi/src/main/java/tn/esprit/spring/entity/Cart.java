package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.TemporalType;

@Entity
public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_cart;
	@Temporal(TemporalType.DATE)
	private Date bail;
	private double total;
	private boolean status_cart_code_promo;
	
	
	//added by nour 
	@ManyToMany
	private List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@ManyToOne
	private CodePromo codePromo;
	
	public CodePromo getCodePromo() {
		return codePromo;
	}
	public void setCodePromo(CodePromo codePromo) {
		this.codePromo = codePromo;
	}
	//end 
	
	

	public void setId_cart(int id_cart) {
		this.id_cart = id_cart;
	}
	public Date getBail() {
		return bail;
	}
	public void setBail(Date bail) {
		this.bail = bail;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isStatus_cart_code_promo() {
		return status_cart_code_promo;
	}
	public void setStatus_cart_code_promo(boolean status_cart_code_promo) {
		this.status_cart_code_promo = status_cart_code_promo;
	}
	public Cart(int id_cart, Date bail, double total, boolean status_cart_code_promo) {
		super();
		this.id_cart = id_cart;
		this.bail = bail;
		this.total = total;
		this.status_cart_code_promo = status_cart_code_promo;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//By lamis 
	@OneToOne(cascade=CascadeType.REMOVE)
	private Donation donation; 
}
