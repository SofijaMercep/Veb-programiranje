package web.projekat.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.repository.KorisnikRepository;

import java.util.List;

@Service
public class KorisnikService {
    @Autowired
    private KorisnikRepository korisnikRepository;

    public List<Korisnik> GetAll()
    {
        return korisnikRepository.findAll();
    }

    public Korisnik GetById(Long id)
    {
        return korisnikRepository.getOneById(id);
    }

    public void Save(Korisnik korisnik)
    {
        korisnikRepository.save(korisnik);
    }

    public void Delete(Korisnik korisnik)
    {
        korisnikRepository.delete(korisnik);
    }

    public Korisnik Registracija(Korisnik k){
        Korisnik korisnik = new Korisnik();
        korisnik.setKorisnicko_ime(k.getKorisnicko_ime());
        korisnik.setLozinka(k.getLozinka());
        korisnik.setIme(k.getIme());
        korisnik.setPrezime(k.getPrezime());
        korisnik.setPol(k.getPol());
        korisnik.setDatum_rodjenja(k.getDatum_rodjenja());
        korisnik.setUloga("KUPAC");
        korisnikRepository.save(korisnik);
        return k;

    }

}
