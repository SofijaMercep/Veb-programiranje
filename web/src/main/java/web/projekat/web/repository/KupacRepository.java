package web.projekat.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Korisnik;

public interface KupacRepository extends JpaRepository<Korisnik,Long> {

}
