package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class RatingSubject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_rating;
	
	@Enumerated(EnumType.STRING)
	private RatingValue rating_value;
	
	@Temporal(TemporalType.DATE)
	private Date date_value;
	
	public int getId_rating() {
		return id_rating;
	}

	public void setId_rating(int id_rating) {
		this.id_rating = id_rating;
	}

	public RatingValue getRating_value() {
		return rating_value;
	}

	public void setRating_value(RatingValue rating_value) {
		this.rating_value = rating_value;
	}

	public Date getDate_value() {
		return date_value;
	}

	public void setDate_value(Date date_value) {
		this.date_value = date_value;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public SubjectForum getSubjectforum() {
		return subjectforum;
	}

	public void setSubjectforum(SubjectForum subjectforum) {
		this.subjectforum = subjectforum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//ASSOCIATIONS
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private SubjectForum subjectforum;
	
	
	//CONSTRUCTEUR

	public RatingSubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingSubject(RatingValue rating_value, Date date_value, Client client, SubjectForum subjectforum) {
		super();
		this.rating_value = rating_value;
		this.date_value = date_value;
		this.client = client;
		this.subjectforum = subjectforum;
	}

	public RatingSubject(int id_rating, RatingValue rating_value, Date date_value, Client client,
			SubjectForum subjectforum) {
		super();
		this.id_rating = id_rating;
		this.rating_value = rating_value;
		this.date_value = date_value;
		this.client = client;
		this.subjectforum = subjectforum;
	}
	public RatingSubject(RatingValue rating_value, Date date_value) {
		super();
		this.rating_value = rating_value;
		this.date_value = date_value;}

	@Override
	public String toString() {
		return "RatingSubject [id_rating=" + id_rating + ", rating_value=" + rating_value + ", date_value=" + date_value
				+ ", client=" + client + ", subjectforum=" + subjectforum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_rating;
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
		RatingSubject other = (RatingSubject) obj;
		if (id_rating != other.id_rating)
			return false;
		return true;
	}
	

}
