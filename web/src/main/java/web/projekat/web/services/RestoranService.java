package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Lokacija;
import web.projekat.web.entity.Restoran;
import web.projekat.web.repository.RestoranRepository;

import java.util.List;

@Service
public class RestoranService {
    @Autowired

    private RestoranRepository restoranRepository;

    public List<Restoran> GetAll()
    {
        return restoranRepository.findAll();
    }

    public Restoran GetById(Long id)
    {
        return restoranRepository.getOneById(id);
    }

    public void Save(Restoran restoran)
    {
        restoranRepository.save(restoran);
    }

    public void Delete(Restoran restoran)
    {
        restoranRepository.delete(restoran);
    }


    public Restoran getByNaziv (String naziv) {
        return restoranRepository.getByNaziv(naziv);
    }

    public Restoran getByLokacija(Lokacija lokacija) {
        return restoranRepository.getByLokacija(lokacija);
    }


    public Restoran findOne(Long id) {
        return restoranRepository.getById(id);
    }

    public List<Restoran> findAll() { return restoranRepository.findAll();
    }
}
