package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entity.Client;
@Repository
public interface IClientRepository extends CrudRepository<Client, Integer>{
	@Query("SELECT c FROM Client c WHERE c.username = :username")
  Client getClientByUsername(@Param("username") String username );
	@Query("SELECT c FROM Client c WHERE c.email = :email")
   Client getClientByEmail(@Param("email") String email );

}
