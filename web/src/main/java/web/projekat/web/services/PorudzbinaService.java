package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Porudzbina;
import web.projekat.web.repository.PorudzbinaRepository;

import java.util.List;

@Service
public class PorudzbinaService {
    @Autowired

    private PorudzbinaRepository porudzbinaRepository;

    public List<Porudzbina> GetAll()
    {
        return porudzbinaRepository.findAll();
    }

    public Porudzbina GetById(Long id)
    {
        return porudzbinaRepository.getOneById(id);
    }

    public void Save(Porudzbina porudzbina)
    {
        porudzbinaRepository.save(porudzbina);
    }

    public void Delete(Porudzbina porudzbina)
    {
        porudzbinaRepository.delete(porudzbina);
    }

}
