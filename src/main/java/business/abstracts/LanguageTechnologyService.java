package business.abstracts;

import business.requests.lt.CreateLanguageTechnologyRequests;
import business.requests.lt.DeleteLanguageTechnologyRequest;
import business.requests.lt.UpdateLanguageTechnologyRequest;
import business.responses.GetAllLanguageTechnologyResponse;
import entities.LanguageTechnology;

import java.util.List;

public interface LanguageTechnologyService {
    List<GetAllLanguageTechnologyResponse> getAll();

    void add(CreateLanguageTechnologyRequests createLanguageTechnologyRequests) throws Exception;

    void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) throws Exception;


    void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest, int id) throws Exception;


}
