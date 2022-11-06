package webApi.Controllers;

import business.abstracts.LanguageTechnologyService;
import business.requests.lt.CreateLanguageTechnologyRequests;
import business.requests.lt.DeleteLanguageTechnologyRequest;
import business.requests.lt.UpdateLanguageTechnologyRequest;
import business.responses.GetAllLanguageTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/LanguageTechnology")
public class LanguageTechnologyControllers {

    private LanguageTechnologyService languageTechnologyService;

    @Autowired
    private LanguageTechnologyControllers(LanguageTechnologyService languageTechnologyService) {
        this.languageTechnologyService = languageTechnologyService;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageTechnologyResponse> getAll() {
        return this.languageTechnologyService.getAll();
    }

    @PostMapping(name = "/add")
    public void add(CreateLanguageTechnologyRequests createLanguageTechnologyRequests) throws Exception{
        this.languageTechnologyService.add(createLanguageTechnologyRequests);
    }

    @DeleteMapping(name = "/delete")
    public void delete(CreateLanguageTechnologyRequests createLanguageTechnologyRequests) throws Exception {
        this.languageTechnologyService.delete(new DeleteLanguageTechnologyRequest());
    }

    @PutMapping(name = "update")
    public void update(CreateLanguageTechnologyRequests createLanguageTechnologyRequests, int id)throws Exception {
        this.languageTechnologyService.update(new UpdateLanguageTechnologyRequest(), id);
    }
}