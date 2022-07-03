package web.projekat.web.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Menadzer  extends Korisnik{
    @OneToMany(mappedBy = "menadzer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Restoran> restorani = new HashSet<>();
//one to one bolje
    public Menadzer() {
    }

    public Menadzer(Long id, String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum_rodjenja, String uloga) {
        super(id, korisnicko_ime, lozinka, ime, prezime, pol, datum_rodjenja, uloga);
    }

    public Menadzer(Set<Restoran> restorani) {
        this.restorani = restorani;
    }

    public Menadzer(Long id, String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum_rodjenja, String uloga, Set<Restoran> restorani) {
        super(id, korisnicko_ime, lozinka, ime, prezime, pol, datum_rodjenja, uloga);
        this.restorani = restorani;
    }

    public Menadzer(String username, String password, String ime, String prezime, String datumRodjenja, String pol, Uloga menadzer, Restoran restoran) {
    }

    public Set<Restoran> getRestorani() {
        return restorani;
    }

    public void setRestorani(Set<Restoran> restorani) {
        this.restorani = restorani;
    }



    @Override
    public String toString() {
        return "Menadzer{" + super.toString()+
                "restoran=" + restorani +
                '}';
    }

    public Object getKorisnickoIme() {
        return null;
    }

}
