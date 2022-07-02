package web.projekat.web.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Kupac extends Korisnik{
    @Column
    private int bodovi;

    @OneToMany(mappedBy = "kupac", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Porudzbina> porudzbine = new HashSet<>();

    @OneToMany(mappedBy = "kupac", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Komentar> komentari = new HashSet<>();


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TipKupca tipKupca;

    public Kupac() {
    }

    public Kupac( String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum_rodjenja, String uloga) {
        super( korisnicko_ime, lozinka, ime, prezime, pol, datum_rodjenja, uloga);
    }

    public Kupac(int bodovi, Set<Porudzbina> porudzbine, Set<Komentar> komentari, TipKupca tipKupca) {
        this.bodovi = bodovi;
        this.porudzbine = porudzbine;
        this.komentari = komentari;
        this.tipKupca = tipKupca;
    }

    public Kupac( String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum_rodjenja, String uloga, int bodovi, Set<Porudzbina> porudzbine, Komentar komentar, TipKupca tipKupca) {
        super(korisnicko_ime, lozinka, ime, prezime, pol, datum_rodjenja, uloga);
        this.bodovi = bodovi;
        this.porudzbine = porudzbine;
        this.komentari = komentari;
        this.tipKupca = tipKupca;
    }

    public int getBodovi() {
        return bodovi;
    }

    public void setBodovi(int bodovi) {
        this.bodovi = bodovi;
    }

    public Set<Porudzbina> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(Set<Porudzbina> porudzbine) {
        this.porudzbine = porudzbine;
    }

    public Set<Komentar> getKomentar() {
        return komentari;
    }

    public void setKomentar(Komentar komentar) {
        this.komentari = komentari;
    }

    public TipKupca getTipKupca() {
        return tipKupca;
    }

    public void setTipKupca(TipKupca tipKupca) {
        this.tipKupca = tipKupca;
    }




}
