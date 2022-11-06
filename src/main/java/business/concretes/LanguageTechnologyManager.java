package business.concretes;

import business.abstracts.LanguageTechnologyService;
import business.responses.GetAllLanguageTechnologyResponses;
import dataAccess.abstracts.LanguageRepository;
import entities.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {

    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private LanguageTechnologyManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguageTechnologyResponses> getAll() {
      List<LanguageTechnology> languageTechnologies=languageRepository.getAll();
      List<GetAllLanguageTechnologyResponses> languageTechnologyResponses=new ArrayList<>();

      for (LanguageTechnology languageTechnology:languageTechnologies){
          GetAllLanguageTechnologyResponses responsesItem=new GetAllLanguageTechnologyResponses();
          responsesItem.setId(languageTechnology.getLanguageId());
          responsesItem.setLanguageName(languageTechnology.getLanguageName());
          languageTechnologyResponses.add(responsesItem);
      }
      return languageTechnologyResponses;
    }

    @Override
    public void add(LanguageTechnology languageTechnology) {
        this.languageRepository.save();

    }

    @Override
    public void delete(LanguageTechnology languageTechnology) {
        this.languageRepository.delete(languageTechnology);

    }

    @Override
    public void update(LanguageTechnology languageTechnology, int id) {
        this.languageRepository.update(languageTechnology, id);

    }

    @Override
    public void update(LanguageTechnology languageTechnology) {

    }


}
