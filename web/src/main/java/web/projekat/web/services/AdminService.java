package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.*;
import web.projekat.web.entity.DTO.DostavljacDTO;
import web.projekat.web.entity.DTO.MenazderDTO;
import web.projekat.web.repository.DostavljacRepository;
import web.projekat.web.repository.KorisnikRepository;
import web.projekat.web.repository.MenadzerRepository;
import web.projekat.web.repository.RestoranRepository;

import java.util.List;
@Service
public class AdminService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Autowired
    private MenadzerRepository menadzerRepository;

    @Autowired
    private DostavljacRepository dostavljacRepository;

    @Autowired
    private RestoranRepository restoranRepository;


    public List<Korisnik> findAll(Korisnik loggedKorisnik)
         {
            return korisnikRepository.findAll();

    }

    //Kreiraj novog menadzera
    public Menadzer createMenadzer(MenazderDTO menadzerDto, Korisnik loggedKorisnik){

            Restoran restoran = restoranRepository.getById(menadzerDto.getIdRestoran());
            if (restoran == null) {
                return null;
            }
            Menadzer menadzer = new Menadzer(menadzerDto.getUsername(),
                    menadzerDto.getPassword(),
                    menadzerDto.getIme(),
                    menadzerDto.getPrezime(),
                    menadzerDto.getDatumRodjenja(),
                    menadzerDto.getPol(),
                    Uloga.MENADZER,
                    restoran);
            if (menadzerRepository.existsByKorisnickoIme()) {
                return null;
            }
            menadzerRepository.save(menadzer);
            return menadzer;

    }

    //Kreiraj novog dostavljaca
    public Dostavljac createDostavljac(DostavljacDTO dostavljacDto, Korisnik loggedKorisnik){

            Dostavljac dostavljac = new Dostavljac(dostavljacDto.getUsername(),
                    dostavljacDto.getPassword(),
                    dostavljacDto.getIme(),
                    dostavljacDto.getPrezime(),
                    dostavljacDto.getDatumRodjenja(),
                    dostavljacDto.getPol(),
                    Uloga.KUPAC);
            if (dostavljacRepository.existsByKorisnickoIme(dostavljac.getKorisnicko_ime())){
                return null;
            }
            dostavljacRepository.save(dostavljac);
            return dostavljac;

    }

}
