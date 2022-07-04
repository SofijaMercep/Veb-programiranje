package web.projekat.web.services;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Dostavljac;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.entity.Kupac;
import web.projekat.web.entity.Menadzer;
import web.projekat.web.repository.KorisnikRepository;
import web.projekat.web.repository.KupacRepository;

import java.util.List;

@Service
public class KorisnikService {
    @Autowired
    private KorisnikRepository korisnikRepository;
    @Autowired
    private KupacRepository kupacRepository;

    public List<Korisnik> GetAll() {
        return korisnikRepository.findAll();
    }

    public Korisnik GetById(Long id) {
        return korisnikRepository.getOneById(id);
    }
//    public Korisnik GetByKorisnickoIme(String kime) {
//        return korisnikRepository.findAllByKime(kime);
//    }

    public void Save(Korisnik korisnik) {
        korisnikRepository.save(korisnik);
    }

    public void Delete(Korisnik korisnik) {
        korisnikRepository.delete(korisnik);
    }

    public Kupac RegistracijaKupca(Kupac k) {
        Kupac korisnik = new Kupac();
        korisnik.setKorisnicko_ime(k.getKorisnicko_ime());
        korisnik.setLozinka(k.getLozinka());
        korisnik.setIme(k.getIme());
        korisnik.setPrezime(k.getPrezime());
        korisnik.setPol(k.getPol());
        korisnik.setDatum(k.getDatum());
        korisnik.setUloga("KUPAC");
        korisnikRepository.save(korisnik);

        return k;
    }

    public Korisnik RegistracijaMenazdera(Korisnik m) {
        Menadzer korisnik = new Menadzer();
        korisnik.setKorisnicko_ime(m.getKorisnicko_ime());
        korisnik.setLozinka(m.getLozinka());
        korisnik.setIme(m.getIme());
        korisnik.setPrezime(m.getPrezime());
        korisnik.setPol(m.getPol());
        korisnik.setDatum(m.getDatum());
        korisnik.setUloga("MENADZER");
        korisnikRepository.save(korisnik);

        return m;
    }

    public Korisnik RegistracijaDostavljaca(Korisnik k) {
        Dostavljac korisnik = new Dostavljac();
        korisnik.setKorisnicko_ime(k.getKorisnicko_ime());
        korisnik.setLozinka(k.getLozinka());
        korisnik.setIme(k.getIme());
        korisnik.setPrezime(k.getPrezime());
        korisnik.setPol(k.getPol());
        korisnik.setDatum(k.getDatum());
        korisnik.setUloga("DOSTAVLJAC");
        korisnikRepository.save(korisnik);

        return k;
    }

    public Korisnik ProveriKorisnika(Korisnik k) {
        Korisnik korisnik = korisnikRepository.findAllByKime(k.getKorisnicko_ime());
        if (korisnik != null) {
            if (korisnik.getLozinka().equals(k.getLozinka()))
                return korisnik;
        }
        return null;
    }

}
