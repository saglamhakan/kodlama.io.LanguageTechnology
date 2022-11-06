package business.abstracts;

import business.responses.GetAllLanguageTechnologyResponses;
import entities.LanguageTechnology;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LanguageTechnologyService {
    List<GetAllLanguageTechnologyResponses> getAll();

    void add(LanguageTechnology languageTechnology);

    void delete(LanguageTechnology languageTechnology);



    void update(LanguageTechnology languageTechnology, int id);

    void update(LanguageTechnology languageTechnology);
}
