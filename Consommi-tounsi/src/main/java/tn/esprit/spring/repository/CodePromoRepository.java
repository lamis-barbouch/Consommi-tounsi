package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CodePromo;;
@Repository

public interface CodePromoRepository extends CrudRepository <CodePromo,Integer>{

}
