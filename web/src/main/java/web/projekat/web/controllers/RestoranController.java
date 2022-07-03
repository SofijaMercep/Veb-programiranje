package web.projekat.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import web.projekat.web.entity.DTO.RestoranDTO;
import web.projekat.web.entity.Komentar;
import web.projekat.web.entity.Lokacija;
import web.projekat.web.entity.Restoran;
import web.projekat.web.services.KomentarService;
import web.projekat.web.services.KorisnikService;
import web.projekat.web.services.MenadzerService;
import web.projekat.web.services.RestoranService;

import java.util.List;

public class RestoranController {



    @Autowired
    private RestoranService restoranService;

    @Autowired
    private KorisnikService korisnikService;

    @Autowired
    private KomentarService komentarService;

    @Autowired
    private MenadzerService menadzerService;

    @GetMapping("/api/restorani")
    public ResponseEntity<List<Restoran>> getRestorani() {
        List<Restoran> restorans = restoranService.findAll();
        return ResponseEntity.ok(restorans);
    }

    @GetMapping("/api/restorani/{id}")
    public ResponseEntity<RestoranDTO> getById(@PathVariable("id") Long id) {
        Restoran restoran = restoranService.findOne(id);
        List<Komentar> komentari = komentarService.getOneById(id);

        RestoranDTO restoranDto = new RestoranDTO();
        restoranDto.setNaziv(restoran.getNaziv());

        restoranDto.setArtikli(restoran.getArtikli());
        restoranDto.setKomentari(komentari);
        restoranDto.setLokacija(restoran.getLokacija());

        return ResponseEntity.ok((restoranDto));
    }

    // kreiranje novog restorana

    @PostMapping("/api/restoran/creaate")
    public ResponseEntity<String> createRestoran(@RequestBody RestoranDTO restoranDto) {

        if(restoranDto.getNaziv().isEmpty()) {
            return new ResponseEntity<>("Neispravni podaci", HttpStatus.BAD_REQUEST);
        }

        Restoran restoran = new Restoran();

        restoran.setNaziv(restoranDto.getNaziv());
        restoran.setLokacija(restoranDto.getLokacija());


        restoranService.Save(restoran);

        return ResponseEntity.ok("Restoran je uspjesno dodat");
    }

    // Pretraga restorana po nazivu

    @GetMapping("/api/restorani/naziv/{naziv}")
    public ResponseEntity<Restoran> getByNaziv(@PathVariable String naziv) {
        Restoran restoran = restoranService.getByNaziv(naziv);
        return ResponseEntity.ok(restoran);
    }

    // pretraga restorana po lokaciji

    @GetMapping("/api/restorani/lokacija/{lokacija}")
    public ResponseEntity<Restoran> getByLokacija (@PathVariable Lokacija lokacija) {
        Restoran restoran = restoranService.getByLokacija(lokacija);
        return ResponseEntity.ok(restoran);
    }
}
