package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LanguageTechnology")
@Entity


public class LanguageTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_id")
    private int languageId;

   @OneToMany(mappedBy = "languageTechnology")
    private List<SubTechnology> subTechnology;
}

