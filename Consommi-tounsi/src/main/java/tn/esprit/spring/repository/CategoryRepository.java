package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Category;;
@Repository

public interface CategoryRepository extends CrudRepository <Category,Integer> {

}
