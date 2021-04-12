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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SubjectForum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_subject;
	
	private String subject;
	
	private String title;
	@Temporal(TemporalType.DATE)
	private Date date_subject;
	private  int number_LikesSubject;
	private  int number_disLikesSubject;
	
	//associations
	@OneToMany(mappedBy="subjectforum",cascade=CascadeType.REMOVE)
	private List<Comment> comment;
	
	@OneToMany(mappedBy="subjectforum",cascade=CascadeType.REMOVE)
	private List<RatingSubject> ratingsubject;
	
	@ManyToMany
	private List<Client> listclient;


	public SubjectForum(int id_subject, String subject, String title, int number_LikesSubject,int number_disLikesSubject) {
		super();
		this.id_subject = id_subject;
		this.subject = subject;
		this.title = title;
		this.number_LikesSubject = number_LikesSubject;
		this.number_disLikesSubject = number_LikesSubject;
	}
	
	public int getId_subject() {
		return id_subject;
	}
	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate_subject() {
		return date_subject;
	}
	public void setDate_subject(Date date_subject) {
		this.date_subject = date_subject;
	}
	public int getNumber_LikesSubject() {
		return number_LikesSubject;
	}
	public void setNumber_LikesSubject(int number_LikesSubject) {
		this.number_LikesSubject = number_LikesSubject;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public List<RatingSubject> getRatingsubject() {
		return ratingsubject;
	}
	public void setRatingsubject(List<RatingSubject> ratingsubject) {
		this.ratingsubject = ratingsubject;
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
	public int getNumber_disLikesSubject() {
		return number_disLikesSubject;
	}
	public void setNumber_disLikesSubject(int number_disLikesSubject) {
		this.number_disLikesSubject = number_disLikesSubject;
	}
	
	//constructor
	public SubjectForum(int id_subject, String subject, String title) {
		super();
		this.id_subject = id_subject;
		this.subject = subject;
		this.title = title;
		
	}
	public SubjectForum(String subject, String title) {
		super();
		this.subject = subject;
		this.title = title;
		
	}
	public SubjectForum() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_subject;
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
		SubjectForum other = (SubjectForum) obj;
		if (id_subject != other.id_subject)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubjectForum [id_subject=" + id_subject + ", subject=" + subject + ", title=" + title
				+ ", date_subject=" + date_subject + ", number_LikesSubject=" + number_LikesSubject
				+ ", number_disLikesSubject=" + number_disLikesSubject + ", comment=" + comment + ", ratingsubject="
				+ ratingsubject + ", listclient=" + listclient + "]";
	}
	
	
	
	
	
}
