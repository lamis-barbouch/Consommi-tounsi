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
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.UserErrors;
import tn.esprit.spring.services.IDeliveryManServices;

@RestController
public class DeliveryManRestController {
@Autowired 
IDeliveryManServices deliveryManServices;
	@PostMapping("/add-deliveryMan")
	@ResponseBody
	public  UserErrors addDeliveryMan(@RequestBody DeliveryMan deliveryMan)
{   UserErrors d1 = deliveryManServices.addDeliveryMan(deliveryMan);
		return  d1;
	 }
	
	@GetMapping("/DeliveryMan/find/{username}")
  @ResponseBody
  public DeliveryMan getDeliveryManByUsername(@PathVariable("username")String username) {
       return deliveryManServices.getdeliveryManByUsername(username);
}
	
	
	
@GetMapping("/DeliveryMan/find/{email}")
    @ResponseBody
    public DeliveryMan getDeliveryManByEmail(@PathVariable("email")String email) {
    return    deliveryManServices.getdeliveryManByEmail(email);
	}

@GetMapping("/retrieve-deliveryMan/{DeliveryMan-id}")
	@ResponseBody
	public DeliveryMan retrieveDeliveryMan(@PathVariable("DeliveryMan-id") int Id) {
	return deliveryManServices.retrieveDeliveryMan(Id);
	}
	
@DeleteMapping("/remove-DeliveryMan/{DeliveryMan-id}")
@ResponseBody
   public String removeDeliveryMan(@PathVariable("DeliveryMan-id") int id_DeliveryMan) {
	deliveryManServices.deletDeliveryMan(id_DeliveryMan);
	return ("done");
	}

@PutMapping("/modify-deliveryMan") 
@ResponseBody
public DeliveryMan modifyDeliveryMan(@RequestBody DeliveryMan deliveryMan) {
DeliveryMan d1 = deliveryManServices.updateDeliveryMan(deliveryMan);
return d1 ;
}}