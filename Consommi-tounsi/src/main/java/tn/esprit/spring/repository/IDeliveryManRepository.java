package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entity.DeliveryMan;
@Repository

public interface IDeliveryManRepository extends CrudRepository<DeliveryMan, Integer>
{
     	@Query("SELECT d FROM DeliveryMan d WHERE d.username = :username")
	    DeliveryMan getDeliveryManByUsername(@Param("username") String username );
		@Query("SELECT d FROM DeliveryMan d WHERE d.email = :email")
		DeliveryMan getDeliveryManByEmail(@Param("email") String email );

	
}
