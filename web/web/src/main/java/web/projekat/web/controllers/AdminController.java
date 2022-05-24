package web.projekat.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.projekat.web.entity.Korisnik;
import web.projekat.web.entity.Kupac;
import web.projekat.web.services.KorisnikService;

@Controller
public class AdminController {
    @Autowired
    private KorisnikService korisnikService;


    @GetMapping("/admin-registracija")
    public String registracijaGet(Model model) {
        Korisnik korisnik = new Korisnik();
        model.addAttribute("korisnik", korisnik);
        return "dodavanjeMenIDost.html";
    }

    @PostMapping("/admin-registracija")
    public String registracijaPost(@ModelAttribute Korisnik k) {
        if (k.getUloga().equals("MENADZER"))
            korisnikService.RegistracijaMenazdera(k);
        else if (k.getUloga().equals("DOSTAVLJAC"))
            korisnikService.RegistracijaDostavljaca(k);

        return "redirect:/admin-registracija";
    }
}
