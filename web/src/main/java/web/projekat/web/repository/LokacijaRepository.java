package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Lokacija;

public interface LokacijaRepository extends JpaRepository<Lokacija,Long>  {
    public Lokacija getOneById(Long id);
}
