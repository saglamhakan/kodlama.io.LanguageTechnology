package business.concretes;

import business.abstracts.SubTechnologiesService;
import entities.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubTechnologyManager implements SubTechnologiesService {

    @Override
    public List<SubTechnology> getAll() {
        return this.getAll();
    }

    @Override
    public void add(SubTechnology subTechnology) {
        this.add(subTechnology);

    }

    @Override
    public void delete(SubTechnology subTechnology) {
        this.delete(subTechnology);

    }

    @Override
    public void update(SubTechnology subTechnology) {
        this.update(subTechnology);

    }
}
