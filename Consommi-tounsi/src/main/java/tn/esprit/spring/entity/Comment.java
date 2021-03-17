package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_comment;
	private String text_comment;
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private SubjectForum subjectforum;
	@ManyToOne
	//private User user;
	
	
	
	public int getId_comment() {
		return id_comment;
	}
	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}
//	public int getId_user() {
//		return id_user;
//	}
//	public void setId_user(int id_user) {
//		this.id_user = id_user;
//	}
	public String getText_comment() {
		return text_comment;
	}
	public void setText_comment(String text_comment) {
		this.text_comment = text_comment;
	}
	public Comment(int id_comment, int id_user, String text_comment) {
		super();
		this.id_comment = id_comment;
		//this.id_user = id_user;
		this.text_comment = text_comment;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
