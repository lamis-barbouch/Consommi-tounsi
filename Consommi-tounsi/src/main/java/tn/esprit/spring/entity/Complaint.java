package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="complaint")
public class Complaint implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_complaint;
	
	@Column(name="type")
	private String type;
	
	@Column(name="status")
	private String status;
	
	@Column(name="date_complaint")
	@Temporal(TemporalType.DATE)
	private Date date_complaint;
	
	@Column(name="date_response")
	@Temporal(TemporalType.DATE)
	private Date date_response;
	
	@Column(name="response")
	@Enumerated(EnumType.STRING)
	private Response response;
	
	@Column(name="specific_subject")
	@Enumerated(EnumType.STRING)
	private Specific specific_subject;
	
	@Column(name="general_subject")
	@Enumerated(EnumType.STRING)
	private General general_subject;

	@ManyToOne
	private User user;
	
	public Long getId_complaint() {
		return id_complaint;
	}

	public void setId_complaint(Long id_complaint) {
		this.id_complaint = id_complaint;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate_complaint() {
		return date_complaint;
	}

	public void setDate_complaint(Date date_complaint) {
		this.date_complaint = date_complaint;
	}

	public Date getDate_response() {
		return date_response;
	}

	public void setDate_response(Date date_response) {
		this.date_response = date_response;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public Specific getSpecific_subject() {
		return specific_subject;
	}

	public void setSpecific_subject(Specific specific_subject) {
		this.specific_subject = specific_subject;
	}

	public General getGeneral_subject() {
		return general_subject;
	}

	public void setGeneral_subject(General general_subject) {
		this.general_subject = general_subject;
	}

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
}
