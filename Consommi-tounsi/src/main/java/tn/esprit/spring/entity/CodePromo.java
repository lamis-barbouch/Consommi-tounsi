package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  
public class CodePromo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_codePromo;
	private String code_promo;
	private boolean status_CodePromo;
	public CodePromo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CodePromo(int id_codePromo, String code_promo, boolean status_CodePromo) {
		super();
		this.id_codePromo = id_codePromo;
		this.code_promo = code_promo;
		this.status_CodePromo = status_CodePromo;
	}

	public int getId_codePromo() {
		return id_codePromo;
	}
	public void setId_codePromo(int id_codePromo) {
		this.id_codePromo = id_codePromo;
	}
	public String getCode_promo() {
		return code_promo;
	}
	public void setCode_promo(String code_promo) {
		this.code_promo = code_promo;
	}
	public boolean isStatus_CodePromo() {
		return status_CodePromo;
	}
	public void setStatus_CodePromo(boolean status_CodePromo) {
		this.status_CodePromo = status_CodePromo;
	}
	
}
