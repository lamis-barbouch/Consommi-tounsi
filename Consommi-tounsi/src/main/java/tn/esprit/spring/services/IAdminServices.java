package tn.esprit.spring.services;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.UserErrors;

public interface IAdminServices {
	public void deleteAdmin(int id);
	public Admin retrieveAdmin(int id);
	public Admin updateAdmin(Admin a);
	public UserErrors addAdmin(Admin a);
    public Admin getadminByUsername(String username);
    public Admin getadminByEmail(String email);
	

}
