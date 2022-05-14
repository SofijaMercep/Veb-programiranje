package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Lokacija;
import web.projekat.web.repository.LokacijaRepository;

import java.util.List;

@Service
public class LokacijaService {
    @Autowired
    private LokacijaRepository lokacijaRepository;

    public List<Lokacija> GetAll()
    {
        return lokacijaRepository.findAll();
    }

    public Lokacija GetById(Long id)
    {
        return lokacijaRepository.getOneById(id);
    }

    public void Save(Lokacija lokacija)
    {
        lokacijaRepository.save(lokacija);
    }

    public void Delete(Lokacija lokacija)
    {
        lokacijaRepository.delete(lokacija);
    }

}
