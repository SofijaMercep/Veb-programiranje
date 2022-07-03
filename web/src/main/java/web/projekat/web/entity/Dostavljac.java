package web.projekat.web.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Dostavljac extends Korisnik{
    @OneToMany(mappedBy = "dostavljac", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Porudzbina> porudzbine = new HashSet<>();

    public Dostavljac() {
    }

    public Dostavljac(Long id, String korisnicko_ime, String lozinka, String ime, String prezime, String pol, String datum_rodjenja, String uloga) {
        super(id, korisnicko_ime, lozinka, ime, prezime, pol, datum_rodjenja, uloga);
    }

    public Dostavljac(String username, String password, String ime, String prezime, String datumRodjenja, String pol, Uloga kupac) {
    }

    public Set<Porudzbina> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(Set<Porudzbina> porudzbine) {
        this.porudzbine = porudzbine;
    }
}
