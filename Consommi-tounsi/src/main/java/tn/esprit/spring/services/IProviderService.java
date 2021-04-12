package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Provider;

public interface IProviderService {
	public int addProvider(Provider provider);  //by admin
	public int updateProvider(Provider provider);  //by admin
    public void deleteProvider(int id); //by admin
    public List<Provider> getAllProvider(); 
    public Provider getProviderById(int id); 
    
    

}
