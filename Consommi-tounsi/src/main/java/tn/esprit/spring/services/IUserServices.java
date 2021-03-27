package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.User;

public interface IUserServices {

public User addUser(User u);
public User updateUser(User u);
public void deleteUser(int id);
public User retrieveUser(int id);
public List<User> retrieveAllUsers();
public User getUserByUsernameOrEmail(String username);





}
