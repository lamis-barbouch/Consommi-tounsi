package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.UserErrors;

public interface IUserServices {
//public User addUser(User u);
public User updateUser(User u);
public void deleteUser(int id);
public User retrieveUser(int id);
public List<User> retrieveAllUsers();
//public User findUserByUsername(String username) ;
public UserErrors addUser( User u);

public User authenticate(String login, String password);
public User getuserByUsername(String username);
public User getuserByEmail(String email);
}
//User findByusernameoremail(String usernameOrEmail);

//public User saveUser(String username, String password, String confirmedPassword);

//public void addRoleToUser(String username, String roleName);}
