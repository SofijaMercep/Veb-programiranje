package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Restoran;

public interface RestoranRepository extends JpaRepository<Restoran,Long> {
    public Restoran getOneById(Long id);
}
