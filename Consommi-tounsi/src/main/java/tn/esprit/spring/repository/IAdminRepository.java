package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.Admin;
public interface IAdminRepository extends CrudRepository<Admin, Integer>{
	@Query("SELECT a FROM Admin a WHERE a.username = :username")
    Admin getAdminByUsername(@Param("username") String username );
	@Query("SELECT a FROM Admin a WHERE a.email= :email")
    Admin getAdminByEmail(@Param("email") String email );

	
}
