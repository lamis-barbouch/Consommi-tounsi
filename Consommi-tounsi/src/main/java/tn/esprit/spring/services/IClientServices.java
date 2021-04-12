package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

//import org.springframework.security.core.userdetails.UserDetails;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.UserErrors;

public interface IClientServices {
	public List<Client> retrieveAllClients () ;
	public void deleteClient(int id);
	public Client retrieveClient(int id);
	public	Client updateClient(Client c);
	public	Client getclientByUserName(String username);
	public Client getclientByEmail(String email);
	public UserErrors addClient(Client c);

}
