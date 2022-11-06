package dataAccess.abstracts;

import entities.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageTechnology, Integer> {



    void save();
    List<LanguageTechnology> getAll();

    void add(LanguageTechnology languageTechnology);

    void delete(LanguageTechnology languageTechnology);

    void update(LanguageTechnology languageTechnology, int id);
}
