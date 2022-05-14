package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.TipKupca;
import web.projekat.web.repository.TipKupcaRepository;

import java.util.List;

@Service
public class TipKupcaService {
    @Autowired

    private TipKupcaRepository tipKupcaRepository;

    public List<TipKupca> GetAll()
    {
        return tipKupcaRepository.findAll();
    }

    public TipKupca GetById(Long id)
    {
        return tipKupcaRepository.getOneById(id);
    }

    public void Save(TipKupca tipKupca)
    {
        tipKupcaRepository.save(tipKupca);
    }

    public void Delete(TipKupca tipKupca)
    {
        tipKupcaRepository.delete(tipKupca);
    }


}
