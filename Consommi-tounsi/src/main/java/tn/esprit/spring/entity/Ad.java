package tn.esprit.spring.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "Ad")
public class Ad {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_ad;
	private int cost;
	private int views;
	
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	private String communication_channel;
	private String targeted_population;
	private String ad_name;
	private boolean status;  
	
	
	@ManyToMany (cascade = CascadeType.ALL, mappedBy="ad")
		private Set<Product> product;
	
	public Ad() {
		super();
	}
	
	public Ad(int id_ad,int cost,int views, Date start_date,Date end_date, String communication_channel,String targeted_population, String ad_name,boolean status ) {
		super();
		this.id_ad = id_ad;
		this.cost = cost;
		this.views = views;
		this.start_date = start_date;
		this.end_date = end_date;
		this.communication_channel = communication_channel;
		this.targeted_population =targeted_population;
		this.ad_name = ad_name;
		this.status = status;
		
	}
	public int getIdad() {
		return id_ad;
	}
	public void setIdad(int id_ad) {
		this.id_ad = id_ad;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Date getStartDate() {
		return start_date;
	}
	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEndDate() {
		return end_date;
	}
	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}
	public String getCommunicationChannel() {
		return communication_channel;
	}
	public void setCommunicationChannel(String communication_channel) {
		this.communication_channel = communication_channel;
	}
	public String getTargetedPopulation() {
		return targeted_population;
	}
	public void setTargetedPoplation(String targeted_population) {
		this.targeted_population = targeted_population;
	}
	public String getAdName() {
		return ad_name;
	}
	public void setAdName(String ad_name) {
		this.ad_name =ad_name;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status =status;
	

}
}
