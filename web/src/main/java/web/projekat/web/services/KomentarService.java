package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Komentar;
import web.projekat.web.repository.KomentarRepository;

import java.util.List;

@Service
public class KomentarService {
    @Autowired
    private KomentarRepository komentarRepository;

    public List<Komentar> GetAll()
    {
        return komentarRepository.findAll();
    }

    public Komentar GetById(Long id)
    {
        return komentarRepository.getOneById(id);
    }

    public void Save(Komentar komentar)
    {
        komentarRepository.save(komentar);
    }

    public void Delete(Komentar komentar)
    {
        komentarRepository.delete(komentar);
    }

    public List<Komentar> getOneById(Long id) {
        return (List<Komentar>) komentarRepository.getOneById(id);
    }
}
