package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Product;

@Repository

<<<<<<< main
public interface ProductRepository extends CrudRepository <Product,Integer>{

=======
public interface ProductRepository extends JpaRepository <Product,Integer>{
	@Query("SELECT p FROM Product p WHERE p.name= :name")
	Product retrieveProductByName(@Param("name") String name);
	
//	@Query("SELECT p FROM Product p WHERE p.status_promotion= :true")
//	List<Product> retrieveProductByPromotion();
	@Query("SELECT p FROM Product p WHERE p.status_promotion= ?1")
	List<Product> retrieveProductByPromotion(Boolean b);
	
>>>>>>> 58f61a5 Fixing the loops and starting the Crud of poduct
}
