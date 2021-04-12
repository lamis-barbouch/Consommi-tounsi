package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.UserErrors;
import tn.esprit.spring.services.IAdminServices;

@RestController
public class AdminRestController {
	@Autowired 
IAdminServices adminServices;
	@PostMapping("/add-admin")
	@ResponseBody
	public  UserErrors addAdmin(@RequestBody Admin a)
{   UserErrors a1 = adminServices.addAdmin(a);
		return  a1;
	 }
	
	@GetMapping("/Admin/find/{username}")
  @ResponseBody
  public Admin getAdminByUsername(@PathVariable("username")String username) {
       return adminServices.getadminByUsername(username);
}
	
	
	
@GetMapping("/Admin/find/{email}")
    @ResponseBody
    public Admin getAdminByEmail(@PathVariable("email")String email) {
    return    adminServices.getadminByEmail(email);
	}
	@GetMapping("/retrieve-admin/{admin-id}")
	@ResponseBody
	public Admin retrieveUser(@PathVariable("admin-id") int Id) {
	return adminServices.retrieveAdmin(Id);
	}
	
@DeleteMapping("/remove-Admin/{admin-id}")
@ResponseBody
   public String removeUser(@PathVariable("admin-id") int id_admin) {
	adminServices.deleteAdmin(id_admin);
	return ("done");
	}

@PutMapping("/modify-admin") 
@ResponseBody
public Admin modifyAdmin(@RequestBody Admin admin) {
Admin a1 = adminServices.updateAdmin(admin);
return a1 ;
}

}
