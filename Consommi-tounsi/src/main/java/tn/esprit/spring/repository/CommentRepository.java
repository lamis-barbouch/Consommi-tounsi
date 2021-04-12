package tn.esprit.spring.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.*;


@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer>{

}
