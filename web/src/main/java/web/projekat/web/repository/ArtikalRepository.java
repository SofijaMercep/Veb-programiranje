package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Artikal;

public interface ArtikalRepository extends JpaRepository<Artikal,Long> {
    public Artikal getOneById(Long id);
}
