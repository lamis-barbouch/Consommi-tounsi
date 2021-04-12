package tn.esprit.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.UserErrors;
import tn.esprit.spring.services.IClientServices;

@RestController
public class ClientRestController {
	@Autowired 
IClientServices clientServices;
	@PostMapping("/add-client")
	@ResponseBody
	public  UserErrors addClient(@RequestBody Client client)
{   UserErrors c1 = clientServices.addClient(client);
		return  c1;
	 }
	
	@GetMapping("/Client/find/{username}")
  @ResponseBody
  public Client getClientByUsername(@PathVariable("username")String username) {
       return clientServices.getclientByUserName(username);
}
	
	
	
@GetMapping("/Client/find/{email}")
    @ResponseBody
    public Client getClientByEmail(@PathVariable("email")String email) {
    return    clientServices.getclientByEmail(email);
	}
	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id") int Id) {
	return clientServices.retrieveClient(Id);
	}
	
@DeleteMapping("/remove-Client/{client-id}")
@ResponseBody
   public String removeClient(@PathVariable("client-id") int id_client) {
	clientServices.deleteClient(id_client);
	return ("done");
	}

@PutMapping("/modify-client") 
@ResponseBody
public Client modifyClient(@RequestBody Client client) {
Client c1 = clientServices.updateClient(client);
return c1 ;
}}