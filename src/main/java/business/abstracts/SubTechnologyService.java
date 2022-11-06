package business.abstracts;

import business.requests.st.CreateAllSubTechnologyRequest;
import business.requests.st.DeleteSubTechnologyRequest;
import business.requests.st.UpdateSubTechnologyRequest;
import business.responses.GetAllSubTechnologyResponse;
import entities.SubTechnology;

import java.util.List;


public interface SubTechnologyService {
   List<GetAllSubTechnologyResponse> getAll();

    void add(CreateAllSubTechnologyRequest createAllSubTechnologyRequest) throws Exception;

    void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception;

    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id) throws Exception;
}
