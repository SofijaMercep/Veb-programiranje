package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Porudzbina;

public interface PorudzbinaRepository extends JpaRepository<Porudzbina,Long> {
    public Porudzbina getOneById(Long id);
}
