package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Provider implements Serializable
{	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_provider;
	private String name_provider;
	private String email;
	private int phone_number;
	private long rib;
	
	@OneToMany(mappedBy="provider")
	 private List<Product> products;
	
	
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Provider() {
		super();
	}
	public int getId_provider() {
		return id_provider;
	}
	public void setId_provider(int id_provider) {
		this.id_provider = id_provider;
	}
	public String getName_provider() {
		return name_provider;
	}
	public void setName_provider(String name_provider) {
		this.name_provider = name_provider;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public long getRib() {
		return rib;
	}
	public void setRib(long rib) {
		this.rib = rib;
	}
	
	

}
