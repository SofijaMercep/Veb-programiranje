package web.projekat.web.controllers;

import com.sun.media.sound.SF2InstrumentRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.entity.Kupac;
import web.projekat.web.services.KorisnikService;

import java.time.Clock;
import java.util.List;

import static sun.misc.Version.println;

@Controller
public class KorisnikController {
    @Autowired
    private KorisnikService korisnikService;

    @PostMapping("/registracija")
    public String registracijaPost(@ModelAttribute Kupac k) {
        Korisnik korisnik = korisnikService.RegistracijaKupca(k);
        if(korisnik != null)
            return "redirect:/prijavljivanje";
        else
            return "redirect:/";
    }
    @PostMapping("/prijavljivanje")
    public String proveri(@ModelAttribute Korisnik k) {
        Korisnik korisnik = korisnikService.ProveriKorisnika(k);
        if(korisnik != null)
            return  "redirect:/korisnik/"+korisnik.getId();
        return "redirect:/";
    }
}
