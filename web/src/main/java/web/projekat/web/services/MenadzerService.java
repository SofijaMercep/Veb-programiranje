package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.entity.Menadzer;
import web.projekat.web.repository.MenadzerRepository;

import java.util.Optional;

public class MenadzerService {

    @Autowired
    private MenadzerRepository menadzerRepository;

    public Korisnik findOne(Long id) {
        Optional<Menadzer> menadzer = menadzerRepository.findById(id);
        if(menadzer.isPresent())
            return menadzer.get();

        return null;
    }
}
