package webApi.Controllers;

import business.abstracts.SubTechnologiesService;
import entities.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class SubTechnologiesControllers {

    private SubTechnologiesService subTechnologiesService;

    @Autowired
    private SubTechnologiesControllers(SubTechnologiesService subTechnologiesService) {
        this.subTechnologiesService = subTechnologiesService;
    }
    @GetMapping("/getAll")
    public List<SubTechnology> getAll() {
        return this.subTechnologiesService.getAll();
    }
    @PostMapping
    public void add(SubTechnology subTechnology){
        this.subTechnologiesService.add(subTechnology);
    }
    @DeleteMapping
    public void delete(SubTechnology subTechnology){
        this.subTechnologiesService.delete(subTechnology);
    }
    @PutMapping
    public void update(SubTechnology subTechnology, int id){
        this.subTechnologiesService.update(subTechnology);
    }
}
