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

@Entity
public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_event;
	private String name_event;
	private String description_event;
	@OneToOne(cascade=CascadeType.ALL)
	private Fund fund;
	
	@ManyToOne
	private Admin admin;
	
	@ManyToMany
	private List<Client>listclient;
	
	@Temporal(TemporalType.DATE)
	private Date start_date_event;
	@Temporal(TemporalType.DATE)
	private Date end_date_event;
	private String place_event;
	private double cost_event;
	private int nb_place_disponible;
	
	@Override
	public String toString() {
		return "Event [id_event=" + id_event + ", name_event=" + name_event + ", description_event=" + description_event
				+ ", fund=" + fund + ", admin=" + admin + ", listclient=" + listclient + ", start_date_event="
				+ start_date_event + ", end_date_event=" + end_date_event + ", place_event=" + place_event
				+ ", cost_event=" + cost_event + ", nb_place_disponible=" + nb_place_disponible + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_event;
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
		Event other = (Event) obj;
		if (id_event != other.id_event)
			return false;
		return true;
	}
	public Fund getFund() {
		return fund;
	}
	public void setFund(Fund fund) {
		this.fund = fund;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Client> getListclient() {
		return listclient;
	}
	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getId_event() {
		return id_event;
	}
	public void setId_event(int id_event) {
		this.id_event = id_event;
	}
	public String getName_event() {
		return name_event;
	}
	public void setName_event(String name_event) {
		this.name_event = name_event;
	}
	public String getDescription_event() {
		return description_event;
	}
	public void setDescription_event(String description_event) {
		this.description_event = description_event;
	}
	public Date getStart_date_event() {
		return start_date_event;
	}
	public void setStart_date_event(Date start_date_event) {
		this.start_date_event = start_date_event;
	}
	public Date getEnd_date_event() {
		return end_date_event;
	}
	public void setEnd_date_event(Date end_date_event) {
		this.end_date_event = end_date_event;
	}
	public String getPlace_event() {
		return place_event;
	}
	public void setPlace_event(String place_event) {
		this.place_event = place_event;
	}
	public double getCost_event() {
		return cost_event;
	}
	public void setCost_event(double cost_event) {
		this.cost_event = cost_event;
	}
	public int getNb_place_disponible() {
		return nb_place_disponible;
	}
	public void setNb_place_disponible(int nb_place_disponible) {
		this.nb_place_disponible = nb_place_disponible;
	}
	public Event(int id_event, String name_event, String description_event, Date start_date_event, Date end_date_event,
			String place_event, double cost_event, int nb_place_disponible) {
		super();
		this.id_event = id_event;
		this.name_event = name_event;
		this.description_event = description_event;
		this.start_date_event = start_date_event;
		this.end_date_event = end_date_event;
		this.place_event = place_event;
		this.cost_event = cost_event;
		this.nb_place_disponible = nb_place_disponible;
	}
	public Event(String name_event, String description_event, Date start_date_event, Date end_date_event,
			String place_event, double cost_event, int nb_place_disponible) {
		super();
		
		this.name_event = name_event;
		this.description_event = description_event;
		this.start_date_event = start_date_event;
		this.end_date_event = end_date_event;
		this.place_event = place_event;
		this.cost_event = cost_event;
		this.nb_place_disponible = nb_place_disponible;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
