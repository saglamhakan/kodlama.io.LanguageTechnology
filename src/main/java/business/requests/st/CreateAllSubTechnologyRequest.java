package business.requests.st;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAllSubTechnologyRequest {
    private int language_id;
    private String name;
}
