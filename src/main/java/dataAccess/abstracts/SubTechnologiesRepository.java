package dataAccess.abstracts;

import entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubTechnologiesRepository extends JpaRepository<SubTechnology, Integer> {
    List<SubTechnology> getAll();

    void add(SubTechnology subTechnology);

    void delete(SubTechnology subTechnology);

    void update(SubTechnology subTechnology);
}
