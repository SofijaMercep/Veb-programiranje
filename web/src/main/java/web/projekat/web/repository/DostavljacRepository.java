package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import web.projekat.web.entity.Dostavljac;

public interface DostavljacRepository extends JpaRepository<Dostavljac,Long> {
    @Query("select (count(d) > 0) from Dostavljac d")
    boolean existsByKorisnickoIme(Object korisnickoIme);
}
