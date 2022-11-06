package dataAccess.abstracts;

import entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer> {

}
