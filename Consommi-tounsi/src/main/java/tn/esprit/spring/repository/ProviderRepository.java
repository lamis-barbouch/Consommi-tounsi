package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Provider;;
@Repository

public interface ProviderRepository extends CrudRepository <Provider,Integer>{

}
