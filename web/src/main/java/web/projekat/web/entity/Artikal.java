package web.projekat.web.entity;

import javax.persistence.*;

@Entity
public class Artikal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private Double cena;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Porudzbina porudzbina;

    @Column
    private  String opis;

    @Column
    private String kolicina;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Restoran restoran;

    @Column
    private String tip;


    public Artikal() {
    }

    public Artikal(Long id, String naziv, Double cena, Porudzbina porudzbina, String opis, Restoran restoran, String kolicina, String tip ) {
        this.id = id;
        this.naziv = naziv;
        this.cena = cena;
        this.porudzbina = porudzbina;
        this.opis = opis;
        this.restoran = restoran;
        this.kolicina = kolicina;
        this.tip = tip;
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

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Porudzbina getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Porudzbina porudzbina) {
        this.porudzbina = porudzbina;
    } // many to many


    public String getOpis() {
        return opis;
    }
    public void setOpis(String opis) {
    this.opis = opis;
}
    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
