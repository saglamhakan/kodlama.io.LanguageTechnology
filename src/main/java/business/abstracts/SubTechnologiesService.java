package business.abstracts;

import entities.SubTechnology;

import java.util.List;


public interface SubTechnologiesService {
   List<SubTechnology> getAll();

    void add(SubTechnology subTechnology);

    void delete(SubTechnology subTechnology);



    void update(SubTechnology subTechnology);
}
