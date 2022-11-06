package webApi.Controllers;

import business.abstracts.SubTechnologyService;
import business.requests.st.CreateAllSubTechnologyRequest;
import business.requests.st.DeleteSubTechnologyRequest;
import business.requests.st.UpdateSubTechnologyRequest;
import business.responses.GetAllLanguageTechnologyResponse;
import business.responses.GetAllSubTechnologyResponse;
import entities.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(name = "/api/sub/language_technology")
public class SubTechnologyControllers {

    private SubTechnologyService subTechnologiesService;

    @Autowired
    private SubTechnologyControllers(SubTechnologyService subTechnologiesService) {
        this.subTechnologiesService = subTechnologiesService;
    }
    @GetMapping("/getAll_sub")
    public List<GetAllSubTechnologyResponse> getAll() {
        return this.subTechnologiesService.getAll();
    }
    @PostMapping(name = "/add_sub")
    public void add(CreateAllSubTechnologyRequest createAllSubTechnologyRequest) throws Exception{
        this.subTechnologiesService.add(createAllSubTechnologyRequest);
    }
    @DeleteMapping(name = "/delete_sub")
    public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception{
        this.subTechnologiesService.delete(deleteSubTechnologyRequest);
    }
    @PutMapping(name = "update_sub")
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id) throws Exception{
        this.subTechnologiesService.update(updateSubTechnologyRequest,id);
    }
}
