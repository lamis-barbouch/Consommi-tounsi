package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Product implements Serializable {

	@Id
	private long id_product;
	private String name;
	private String description;
	private float poids;
	private float price;
	private float selling_price;
	private float rating;
	private int stock;
	private boolean status_promotion ;
	private float promotion_percentage;
	private Date date_beginning_promotion;
	private Date date_end_promotion;
	public Product() {
		super();
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(float selling_price) {
		this.selling_price = selling_price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isStatus_promotion() {
		return status_promotion;
	}
	public void setStatus_promotion(boolean status_promotion) {
		this.status_promotion = status_promotion;
	}
	public float getPromotion_percentage() {
		return promotion_percentage;
	}
	public void setPromotion_percentage(float promotion_percentage) {
		this.promotion_percentage = promotion_percentage;
	}
	public Date getDate_beginning_promotion() {
		return date_beginning_promotion;
	}
	public void setDate_beginning_promotion(Date date_beginning_promotion) {
		this.date_beginning_promotion = date_beginning_promotion;
	}
	public Date getDate_end_promotion() {
		return date_end_promotion;
	}
	public void setDate_end_promotion(Date date_end_promotion) {
		this.date_end_promotion = date_end_promotion;
	}



	
	
	
	
}
