package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Artikal;
import web.projekat.web.repository.ArtikalRepository;

import java.util.List;

@Service
public class ArtikalService {
    @Autowired
    private ArtikalRepository artikalRepository;

    public List<Artikal> GetAll()
    {
        return artikalRepository.findAll();
    }

    public Artikal GetById(Long id)
    {
        return artikalRepository.getOneById(id);
    }

    public void Save(Artikal artikal)
    {
        artikalRepository.save(artikal);
    }

    public void Delete(Artikal artikal)
    {
        artikalRepository.delete(artikal);
    }

}
