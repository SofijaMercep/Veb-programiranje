package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik,Long> {
    public Korisnik getOneById(Long id);
}
