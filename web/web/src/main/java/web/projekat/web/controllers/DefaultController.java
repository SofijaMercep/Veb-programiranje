package web.projekat.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping(value = "")
    public String pocetna(){ return "index.html";}

//    @GetMapping(value = "/registracija")
//    public String registracija(){ return "registracija.html";}

    @GetMapping(value = "/prijavljivanje")
    public String prijavljivanje(){ return "prijavljivanje.html";}
}
