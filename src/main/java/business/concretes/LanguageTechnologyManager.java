package business.concretes;

import business.abstracts.LanguageTechnologyService;
import business.requests.lt.CreateLanguageTechnologyRequests;
import business.requests.lt.DeleteLanguageTechnologyRequest;
import business.requests.lt.UpdateLanguageTechnologyRequest;
import business.responses.GetAllLanguageTechnologyResponse;
import dataAccess.abstracts.LanguageRepository;
import entities.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {
    public LanguageRepository languageRepository;

    @Autowired
    public LanguageTechnologyManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanguageTechnologyResponse> getAll() {
        List<LanguageTechnology> languageTechnologies = languageRepository.findAll();
        List<GetAllLanguageTechnologyResponse> getAllLanguageTechnologyResponses = new ArrayList<GetAllLanguageTechnologyResponse>();

        for (LanguageTechnology languageTechnology : languageTechnologies) {
            GetAllLanguageTechnologyResponse responseItem = new GetAllLanguageTechnologyResponse();
            responseItem.setId(languageTechnology.getLanguageId());
            responseItem.setName(languageTechnology.getLanguageName());
            getAllLanguageTechnologyResponses.add(responseItem);
        }
        return getAllLanguageTechnologyResponses;
    }

    @Override
    public void add(CreateLanguageTechnologyRequests createLanguageTechnologyRequests) throws Exception {
        LanguageTechnology technology=new LanguageTechnology();
        technology.setLanguageName(createLanguageTechnologyRequests.getName());
        this.languageRepository.save(new LanguageTechnology());

    }

    @Override
    public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) throws Exception {
        languageRepository.deleteById(deleteLanguageTechnologyRequest.getId());

    }

    @Override
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest, int id) throws Exception {
        if (!updateLanguageTechnologyRequest.getName().isEmpty()){
            LanguageTechnology updatedLanguageTechnology=languageRepository.findById(id).get();
            updatedLanguageTechnology.setLanguageName(updatedLanguageTechnology.getLanguageName());
            languageRepository.save(updatedLanguageTechnology);
        }

    }
}
