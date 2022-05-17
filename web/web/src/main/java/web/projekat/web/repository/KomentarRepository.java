package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Komentar;

public interface KomentarRepository extends JpaRepository<Komentar,Long> {
    public Komentar getOneById(Long id);
}
