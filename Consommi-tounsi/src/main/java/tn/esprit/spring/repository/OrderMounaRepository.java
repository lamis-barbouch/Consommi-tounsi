package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.OrderMouna;
@Repository

public interface OrderMounaRepository extends JpaRepository <OrderMouna,Integer> {

}
