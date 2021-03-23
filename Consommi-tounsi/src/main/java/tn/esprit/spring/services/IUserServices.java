package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.User;

public interface IUserServices {

public List<Client> retrieveAllClients () ;
public void deleteClient(int id);
public Client retrieveClient(int id);
public	User updateClient(Client c);
public Client addClient(Client c);


public void deleteAdmin(int id);
public Admin retrieveAdmin(int id);
public User updateAdmin(Admin a);
public Admin addAdmin(Admin a);




public User addUser(User u);
public User updateUser(User u);
public void deleteUser(int id);
public User retrieveUser(int id);
public List<User> retrieveAllUsers();



public DeliveryMan addDeliveryMan(DeliveryMan d);
public DeliveryMan updateDeliveryMan(DeliveryMan d);
public void deletDeliveryMan(int id);
public DeliveryMan retrieveDeliveryMan(int id);
public List<DeliveryMan> retrieveAllDeliveryMans();

}
