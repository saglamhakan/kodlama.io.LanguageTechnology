package webApi.Controllers;

import business.abstracts.LanguageTechnologyService;
import business.responses.GetAllLanguageTechnologyResponses;
import entities.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language_technologies")
public class LanguageTechnologyControllers {

    private LanguageTechnologyService languageTechnologyService;

    @Autowired
    private LanguageTechnologyControllers(LanguageTechnologyService languageTechnologyService) {
        this.languageTechnologyService = languageTechnologyService;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageTechnologyResponses> getAll() {
        return this.languageTechnologyService.getAll();
    }

    @PostMapping
    public void add(LanguageTechnology languageTechnology) {
        this.languageTechnologyService.add(languageTechnology);
    }

    @DeleteMapping
    public void delete(LanguageTechnology languageTechnology) {
        this.languageTechnologyService.delete(languageTechnology);
    }

    @PutMapping
    public void update(LanguageTechnology languageTechnology, int id) {
        this.languageTechnologyService.update(languageTechnology, id);
    }
}