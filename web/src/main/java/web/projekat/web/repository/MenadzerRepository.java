package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import web.projekat.web.entity.Menadzer;

public interface MenadzerRepository extends JpaRepository<Menadzer,Long> {
    @Query("select (count(m) > 0) from Menadzer m")
    boolean existsByKorisnickoIme();


}
