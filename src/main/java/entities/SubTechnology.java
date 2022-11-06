package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subTechnology")
@Entity

public class SubTechnology {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sub_technologies_name")
    private String subTechnologyName;

    @Column(name = "sub_technologies_id")
    private int subTechnologyId;


    @ManyToOne
    @JoinColumn(name = "language_technology_language_name")
    private LanguageTechnology languageTechnology;
}
