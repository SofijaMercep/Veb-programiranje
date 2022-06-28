package web.projekat.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.projekat.web.entity.Korisnik;

@Controller
public class DefaultController {
    @GetMapping(value = "")
    public String pocetna(){ return "index.html";}

    @GetMapping("/registracija")
    public String registracijaGet(Model model) {
        Korisnik korisnik = new Korisnik();
        model.addAttribute("korisnik", korisnik);
        return "registracija.html";
    }

    @GetMapping("/prijavljivanje")
    public String prijavljivanjeGet(Model model) {
        Korisnik korisnik = new Korisnik();
        model.addAttribute("korisnik", korisnik);
        return "prijavljivanje.html";
    }
}
