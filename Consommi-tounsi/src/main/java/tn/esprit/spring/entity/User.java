package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.validation.constraints.Pattern;
import tn.esprit.spring.entity.Role;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable{
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
    
	private int id_user;
	@OneToMany(mappedBy="user")
    List<Complaint> complaints;
    @Column(nullable = false, unique=true, length=20)
    private String first_name ;
    @Column(nullable = false, unique=true, length=20)
    private String last_name ;
    @Enumerated(EnumType.STRING)
	private Role role;
    public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	private int phone_number;
    
    @Column(nullable = false, unique=true, length=45)
//    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "{user.invalid.email.format}")
	private String email ;
    @Column(nullable = false, unique=true, length=45)
    private String password;
    private String gender ;
    private  String username;
    @Temporal (TemporalType.DATE)
	private Date date ;
    private boolean actived;
	public boolean getActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public User(int id_user, List<Complaint> complaints, String first_name, String last_name, int phone_number,
			String email,String password, String gender, String username, Date date) {
		super();
		this.id_user = id_user;
		this.complaints = complaints;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.username = username;
		this.date = date;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
    		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//public Set<Role> getRoles() {
		//return roles;
//	}
	//public void setRoles(Set<Role> roles) {
		//this.roles = roles;
	//}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	 public String getUsername() {
			return username;
	}
		public void setUsername(String username) {
			this.username = username;
	}
		//@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
		//private Set<Role> roles = new HashSet<>();
}
