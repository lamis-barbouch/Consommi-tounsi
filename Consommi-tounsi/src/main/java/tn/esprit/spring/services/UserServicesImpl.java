package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.IAdminRepository;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.repository.IDeliveryManRepository;
import tn.esprit.spring.repository.IUserRepository;

@Service
public class UserServicesImpl implements IUserServices


{
	@Autowired
	IClientRepository clientrep ;
    @Autowired
    IAdminRepository adminrep;
    @Autowired 
    IUserRepository userrep;
    @Autowired
    IDeliveryManRepository deliveryManrep;
    
	@Override
	public List<Client> retrieveAllClients ()
	{
		List<Client> client =(List<Client>) clientrep.findAll();
		return client ;	
	}
	
	@Override
		public void deleteClient (int id) {
			clientrep.deleteById(id);
				}
	@Override
		public Client retrieveClient (int id) {
		
			Client client=clientrep.findById(id).get();
			return client;
		
			}
	 @Override
		public Client addClient(Client c) {
			Client c1= clientrep.save(c);
			return c1;
			}
	 @Override
		public User updateClient(Client c) {
			
			Client c1= clientrep.save(c);
			return c1;
	 }


	@Override
			public void deleteAdmin (int id) {
				adminrep.deleteById(id);
					}
		@Override
			public Admin retrieveAdmin (int id) {
			
				Admin admin=adminrep.findById(id).get();
				return admin;
			
				}
		 @Override
			public Admin addAdmin(Admin a) {
				Admin a1= adminrep.save(a);
				return a1;
				}
		 @Override
			public Admin updateAdmin(Admin a) {
				
				Admin a1= adminrep.save(a);
				return a1;
				}
          @Override
			public User addUser(User u) {
				User u1= userrep.save(u);
				return u1;
				}
          @Override
			public User updateUser(User u) {
				
				User u1= userrep.save(u);
				return u1;
          }
		

       	 @Override
       			public void deleteUser (int id) {
      				userrep.deleteById(id);
      					}
          @Override
      	 public User retrieveUser (int id) {
      	 User user=userrep.findById(id).get();
         return user;
      			
      }
          @Override
          public List<User> retrieveAllUsers ()
      	{
      		List<User> user =(List<User>) userrep.findAll();
      		return user ;	
      	}
          @Override
       			public DeliveryMan addDeliveryMan (DeliveryMan d) {
        	  DeliveryMan d1= deliveryManrep.save(d);
       				return d1;
       				}
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
      	


      








}

	


