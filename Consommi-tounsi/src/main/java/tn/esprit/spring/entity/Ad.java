package tn.esprit.spring.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "Ad")
public class Ad {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_ad;
	private double cost;
	private int views;
	
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	private String communication_channel;
	private String targeted_population;
	private String ad_name;
	private boolean status;  
	@ManyToMany
	private List<Product> products;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Ad() {
		super();
	}
	
	
	public Ad(int id_ad,double cost,int views, Date start_date,Date end_date, String communication_channel,String targeted_population, String ad_name,boolean status ) {
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
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
	@Override
	public String toString() {
		return "Ad [id_ad=" + id_ad + ", cost=" + cost + ", views=" + views + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", communication_channel=" + communication_channel + ", targeted_population=" + targeted_population + ", ad_name="
				+ ad_name +" , status="+status + "]";
}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_ad;
		result = prime * result + views;
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((communication_channel == null) ? 0 : communication_channel.hashCode());
		result = prime * result + ((targeted_population == null) ? 0 : targeted_population.hashCode());
		
		
		
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
		Ad other = (Ad) obj;
		if (id_ad != other.id_ad)
			return false;
		if (views != other.views)
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (communication_channel == null) {
			if (other.communication_channel != null)
				return false;
		} else if (!communication_channel.equals(other.communication_channel))
			return false;
		if (targeted_population != other.targeted_population)
			return false;
		if (targeted_population != other.targeted_population)
			return false;
		return true;
	}
}