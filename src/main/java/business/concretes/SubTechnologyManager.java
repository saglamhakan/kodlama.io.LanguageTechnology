package business.concretes;

import business.abstracts.SubTechnologyService;
import business.requests.st.CreateAllSubTechnologyRequest;
import business.requests.st.DeleteSubTechnologyRequest;
import business.requests.st.UpdateSubTechnologyRequest;
import business.responses.GetAllSubTechnologyResponse;
import dataAccess.abstracts.LanguageRepository;
import dataAccess.abstracts.SubTechnologyRepository;
import entities.LanguageTechnology;
import entities.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    private SubTechnologyRepository subTechnologyRepository;
    private LanguageRepository languageRepository;

    @Autowired
    public SubTechnologyManager(LanguageRepository languageRepository, SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<SubTechnology> subTechnologies=subTechnologyRepository.findAll();
        List<GetAllSubTechnologyResponse> responses=new ArrayList<>();

        for (SubTechnology subTechnology:subTechnologies){
            GetAllSubTechnologyResponse responseItem=new GetAllSubTechnologyResponse();
            responseItem.setName(subTechnology.getSubTechnologyName());
            responseItem.setName(subTechnology.getLanguageTechnology().getLanguageName());
            responses.add(responseItem);
        }
        return responses;
    }

    @Override
    public void add(CreateAllSubTechnologyRequest createAllSubTechnologyRequest) throws Exception {
        SubTechnology subTechnology=new SubTechnology();
        LanguageTechnology languageTechnology=languageRepository.findById(createAllSubTechnologyRequest.getLanguage_id()).get();

        subTechnology.setSubTechnologyName(createAllSubTechnologyRequest.getName());
        subTechnology.setLanguageTechnology(languageTechnology);
        subTechnologyRepository.save(subTechnology);

    }

    @Override
    public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception {
        subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getId());

    }

    @Override
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id) throws Exception {
        SubTechnology subTechnology=subTechnologyRepository.findById(id).get();
        LanguageTechnology languageTechnology=languageRepository.findById(updateSubTechnologyRequest.getLanguage_id()).get();

        subTechnology.setSubTechnologyName(updateSubTechnologyRequest.getName());
        subTechnology.setLanguageTechnology(languageTechnology);
        subTechnologyRepository.save(subTechnology);

    }
}
