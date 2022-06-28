package web.projekat.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.projekat.web.entity.TipKupca;

public interface TipKupcaRepository extends JpaRepository<TipKupca,Long> {
    public TipKupca getOneById(Long id);
}
