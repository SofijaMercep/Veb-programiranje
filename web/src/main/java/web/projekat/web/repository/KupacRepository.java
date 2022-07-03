package web.projekat.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.entity.Kupac;

import java.util.List;

public interface KupacRepository extends JpaRepository<Korisnik,Long> {

    List<Korisnik> findAll();
    Korisnik getById(Long aLong);
    Kupac getByKime(String username);
    boolean existsByKime(String username);

}
