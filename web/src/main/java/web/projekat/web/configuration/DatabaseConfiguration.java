package web.projekat.web.configuration;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.projekat.web.entity.*;
import web.projekat.web.repository.*;

@Configuration
public class DatabaseConfiguration {


    @Autowired
    private ArtikalRepository artikalRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private DostavljacRepository dostavljacRepository;

    @Autowired
    private KomentarRepository komentarRepository;

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Autowired
    private KupacRepository kupacRepository;

    @Autowired
    private LokacijaRepository lokacijaRepository;

    @Autowired
    private MenadzerRepository menadzerRepository;

    @Autowired
    private PorudzbinaRepository porudzbinaRepository;

    @Autowired
    private RestoranRepository restoranRepository;

    @Autowired
    private TipKupcaRepository tipKupcaRepository;

    @Autowired
    BeanFactory beanFactory;


  /*  @Bean
    public boolean instantiate() {
        TipKupca zlatniTipKupca = new TipKupca(  "Zlatni",
                0.5,
                500
        );
        tipKupcaRepository.save(zlatniTipKupca);

        TipKupca srebrniTipKupca = new TipKupca(
                "Srebrni",
                0.3,
                300
        );
        tipKupcaRepository.save(srebrniTipKupca);

        TipKupca bronzaniTipKupca = new TipKupca(
                "Bronzani",
                0.15,
                150
        );
        tipKupcaRepository.save(bronzaniTipKupca);


        ///admin

        Korisnik admin = new Korisnik(
                "lazo", "1234",
                "Lazar", "Lazic",
                 "Muski" , "01.01.2000.",
                "Admin"
        );
        korisnikRepository.save(admin);


        ///lokacije

        Lokacija lokacija = new Lokacija(
                22.251356788765, 12.8379678987,
                "Strazilovska 14, Novi Sad"
        );
        lokacijaRepository.save(lokacija);

        Lokacija lokacija1 = new Lokacija(
                33.76556787543, 13.54565456556,
                "Danila Kisa 9, Novi Sad"
        );
        lokacijaRepository.save(lokacija1);

        Lokacija lokacija2 = new Lokacija(
                44.246654532537, 14.841266655696,
                "Zeljeznicka 11, Novi Sad"
        );
        lokacijaRepository.save(lokacija2);



        ///restorani

        Restoran burek = new Restoran();
        burek.setLokacija(lokacija1);
        burek.setNaziv("Koliba");
        burek.setTip("Domaci burek");
        restoranRepository.save(burek);

        Restoran italijana = new Restoran();
        italijana.setLokacija(lokacija);
        italijana.setNaziv("Pica i pasta");
        italijana.setTip("Italijanska hrana");
        restoranRepository.save(italijana);

        Restoran kinezi = new Restoran();
        kinezi.setLokacija(lokacija2);
        kinezi.setNaziv("Dva stapica");
        kinezi.setTip("Kineska hrana");
        restoranRepository.save(kinezi);


        ///menadzeri


        Menadzer menadzer = new Menadzer("Maja",
                "111", "Marija",
                "Majic", "Zensko", "05.05.1995.","menadzer"
        );
        menadzerRepository.save(menadzer);



        Menadzer menadzer1 = new Menadzer("Kole", "1111",
                "Kosta", "Kole",
                "Musko", "12.12.1995.", "menadzer"

        );
        menadzerRepository.save(menadzer1);


        ///dostavljaci


        Dostavljac dostavljac = new Dostavljac("Zile", "1111",
                "Zivan", "Zikic",
                "Musko", "02.02.2000.", "dostavljac"

        );
        dostavljacRepository.save(dostavljac);

        Dostavljac dostavljac1 = new Dostavljac("Viki" , "1111",
                "Vinko", "Milić",
                "Muski", "12.03.1994.", "dostavljac"

        );
        dostavljacRepository.save(dostavljac1);


        ///kupci

        Kupac kupac = new Kupac(
                "Tars", "1111",
                "Tara", "Tatic", "Zensko", "23.07.1997.", "kupac"

        );
        kupac.setBodovi(150);
        kupac.setTipKupca(srebrniTipKupca);
        kupacRepository.save(kupac);

        Kupac kupac1 = new Kupac(
                "Mark", "1111",
                "Marko", "Makic", "Musko", "12.12.2000.", "kupac"

        );
        kupac1.setBodovi(300);
        kupac1.setTipKupca(bronzaniTipKupca);
        kupacRepository.save(kupac1);

        Kupac kupac2 = new Kupac(  "Mica",
                "1111", "Milica",
                "Milica", "Zensko", "04.04.2000.", "kupac"

        );
        kupac2.setBodovi(500);
        kupac2.setTipKupca(zlatniTipKupca);
        kupacRepository.save(kupac2);






        return true;
    }
*/

}
