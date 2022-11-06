package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "/subTechnologies")
@Entity

public class SubTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_technologies_name")
    private String subTechnologiesName;
    @Column(name = "sub_technologies_id")
    private int subTecnologiesId;


    @ManyToOne
    @JoinColumn(name = "language_technology_language_name")
    private LanguageTechnology languageTechnology;
}
