package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CreditCard;
@Repository

public interface CreditCardRepository extends CrudRepository <CreditCard,Integer>{

}
