package tn.esprit.spring.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.*;


@Repository
public interface SubjectForumRepository extends CrudRepository<SubjectForum,Integer>{

	SubjectForum findByTitle(String title);
}
