package web.projekat.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.services.KorisnikService;

@Controller
public class KorisnikController {
    @Autowired
    private KorisnikService korisnikService;

    @GetMapping("/registracija")
    public String registracijaGet(Model model) {
        Korisnik korisnik = new Korisnik();
        model.addAttribute("korisnik", korisnik);
        return "registracija.html";
    }

    @PostMapping("/registracija")
    public String registracijaPost(@ModelAttribute Korisnik k) {
        Korisnik korisnik = korisnikService.Registracija(k);
        if(korisnik != null)
            return "redirect:/prijavljivanje";
        else
            return "redirect:/";
    }
}
