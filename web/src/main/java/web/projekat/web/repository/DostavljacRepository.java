package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.Dostavljac;

public interface DostavljacRepository extends JpaRepository<Dostavljac,Long> {
}
