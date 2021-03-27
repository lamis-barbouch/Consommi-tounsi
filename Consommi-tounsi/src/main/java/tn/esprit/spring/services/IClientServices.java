package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.UserErrors;

public interface IClientServices {
	public List<Client> retrieveAllClients () ;
	public void deleteClient(int id);
	public Client retrieveClient(int id);
	public	Client updateClient(Client c);
	//public Client addClient(Client c);
	public	Client getclientByUsername(String username);
	public Client getclientByEmail(String email);
	public UserErrors addClient(Client c);

}
