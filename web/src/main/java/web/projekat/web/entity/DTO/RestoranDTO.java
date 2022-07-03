package web.projekat.web.entity.DTO;

import web.projekat.web.entity.Artikal;
import web.projekat.web.entity.Komentar;
import web.projekat.web.entity.Lokacija;

import java.util.List;
import java.util.Set;

public class RestoranDTO {


    private String naziv;
    private Lokacija lokacija;
    private List<Komentar> komentari;
    private Set<Artikal> artikli;

    public RestoranDTO() {}

    public RestoranDTO(String naziv,  Lokacija lokacija, List<Komentar> komentari, Set<Artikal> artikli) {
        super();
        this.naziv = naziv;
        this.lokacija = lokacija;
        this.komentari = komentari;
        this.artikli = artikli;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public List<Komentar> getKomentari() {
        return komentari;
    }

    public void setKomentari(List<Komentar> komentari) {
        this.komentari = komentari;
    }

    public Set<Artikal> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikal> artikli) {
        this.artikli = artikli;
    }

}
