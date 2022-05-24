package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Korisnik;

import java.util.List;

public interface KorisnikRepository extends JpaRepository<Korisnik,Long> {
    public Korisnik getOneById(Long id);
    public Korisnik findAllByKime(String korisnicko_ime);
}
