package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.UserErrors;
import tn.esprit.spring.repository.IDeliveryManRepository;
@Service

public class DeliveryManServicesImpl implements IDeliveryManServices{
	@Autowired
	IDeliveryManRepository deliveryManrep;
	
	 // @Override
		//	public DeliveryMan addDeliveryMan (DeliveryMan d) {
	  //DeliveryMan d1= deliveryManrep.save(d);
			//	return d1;
		//		}
       @Override
	     public DeliveryMan updateDeliveryMan(DeliveryMan d) {
				
      	 DeliveryMan d1= deliveryManrep.save(d);
				return d1;
       }
		

    	 @Override
    			public void deletDeliveryMan (int id) {
    		deliveryManrep.deleteById(id);
   					}
       @Override
   			public DeliveryMan retrieveDeliveryMan (int id) {
   			
      	 DeliveryMan deliveryMan=deliveryManrep.findById(id).get();
   				return deliveryMan;
   			
   				}
       @Override
       public List<DeliveryMan> retrieveAllDeliveryMans ()
   	{
   		List<DeliveryMan> deliveryMan=(List<DeliveryMan>) deliveryManrep.findAll();
   		return deliveryMan ;	
   	}

       
       
  	 @Override
  	 public DeliveryMan getdeliveryManByUsername(String username)
  	 {
  	  return deliveryManrep.getDeliveryManByUsername( username);	 
  	 }
  	 @Override
  	 public DeliveryMan getdeliveryManByEmail(String email)
  	 {
  	  return deliveryManrep.getDeliveryManByEmail( email);	 
  	 }
  	 
  	 @Override
  	public UserErrors addDeliveryMan(DeliveryMan d) {
        if (deliveryManrep.getDeliveryManByUsername(d.getUsername())!=null)
            return UserErrors.USERNAME_ALREADY_EXISTS;
        if (deliveryManrep.getDeliveryManByEmail(d.getEmail())!=null)
            return UserErrors.EMAIL_ALREADY_EXISTS;
        else deliveryManrep.save(d);
	   return  UserErrors.SUCCESS;
 
  	 
}}
