package tn.esprit.spring.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.UserErrors;
import tn.esprit.spring.repository.IUserRepository;
@Service
@EnableScheduling
public class UserServicesImpl implements IUserServices{
	@Autowired 
    IUserRepository userrep;
  @Override
public UserErrors addUser( User u) {
        if (userrep.findByUsername(u.getUsername())!=null)
            return UserErrors.USERNAME_ALREADY_EXISTS;
        if (userrep.findByEmail(u.getEmail())!=null)
            return UserErrors.EMAIL_ALREADY_EXISTS;
        else userrep.save(u);
	   return  UserErrors.SUCCESS;
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
          public User getuserByUsername(String username)
          {
           return userrep.findByUsername( username);	 
          }
          @Override
          public User getuserByEmail(String email)
          {
           return userrep.findByEmail( email);	 
          }
//          @Override
//      	public User findByusernameoremail(String usernameOrEmail) {
//
//      		User u = new User();
//      		u = IUserRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).get();
//          	return u;
//      	}
//        
          @Override
      	public User authenticate(String login, String password) {
      		return userrep.findByEmailAndPassword(login, password);
      	}

		
      	
 }

	


