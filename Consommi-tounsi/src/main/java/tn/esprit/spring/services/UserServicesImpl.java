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


{ @Autowired 
    IUserRepository userrep;
   


	
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
           public User getUserByUsernameOrEmail(String username) {
           return userrep.getUserByUsernameOrEmail(username);
              }
      








}

	


