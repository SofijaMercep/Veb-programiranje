package web.projekat.web.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Restoran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private String tip;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Menadzer menadzer;

    @OneToMany(mappedBy = "restoran", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Artikal> artikli = new HashSet<>();


    @OneToMany(mappedBy = "restoran", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Porudzbina> porudzbine = new HashSet<>();
    // lista komentara

    @OneToMany(mappedBy = "restoran", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Komentar> komentari = new HashSet<>();



    @OneToOne
    private Lokacija lokacija;


    public Restoran() {
    }

    public Restoran( String naziv, String tip,  Menadzer menadzer, Set<Artikal> artikli, Set<Porudzbina> porudzbine, Lokacija lokacija) {
        this.naziv = naziv;
        this.tip = tip;
        this.menadzer = menadzer;
        this.artikli = artikli;
        this.porudzbine = porudzbine;
        this.lokacija = lokacija;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public void setMenadzer(Menadzer menadzer) {
        this.menadzer = menadzer;
    }

    public Set<Artikal> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikal> artikli) {
        this.artikli = artikli;
    }

    public Set<Porudzbina> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(Set<Porudzbina> porudzbine) {
        this.porudzbine = porudzbine;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }


    @Override
    public String toString() {
        return "Restoran{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", tip='" + tip + '\'' +
                ", lokacija=" + lokacija +
                ", restoran=" + artikli +
                ", porudzbina=" +  porudzbine +
                '}';
    }
}
