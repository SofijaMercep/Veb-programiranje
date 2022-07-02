package web.projekat.web.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Korisnik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String kime;

    @Column
    private String lozinka;

    @Column
    private String ime;

    @Column
    private String prezime;

    @Column
    private String pol;

    @Column
    private String datum;

    @Column
    private String uloga;

    public Korisnik() {
    }

    public Korisnik( String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum, String uloga) {
        this.ime = ime;
        this.prezime = prezime;
        this.kime = korisnicko_ime;
        this.lozinka = lozinka;
        this.pol = pol;
        this.datum = datum;
        this.uloga = uloga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKorisnicko_ime() {
        return kime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.kime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum_rodjenja) {
        this.datum = datum_rodjenja;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }


    @Override
    public String toString() {
        return "Korisnik{" +
                "id=" + id +
                ", korisnicko_ime='" + kime + '\'' +
                ", lozinka='" + lozinka + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datum_rodjenja=" + datum +
                ", pol='" + pol + '\'' +
                ", uloga=" + uloga +
                '}';
    }
}