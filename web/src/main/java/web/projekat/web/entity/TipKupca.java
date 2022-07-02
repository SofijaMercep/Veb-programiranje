package web.projekat.web.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TipKupca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ime;

    @Column
    private double popust;

    @Column
    private int trazeni_broj_bodova;

    @OneToMany(mappedBy = "tipKupca", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Kupac> kupci = new HashSet<>();

    public TipKupca() {
    }

    public TipKupca( String ime, double popust, int trazeni_broj_bodova) {
        this.ime = ime;
        this.popust = popust;
        this.trazeni_broj_bodova = trazeni_broj_bodova;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public int getTrazeni_broj_bodova() {
        return trazeni_broj_bodova;
    }

    public void setTrazeni_broj_bodova(int trazeni_broj_bodova) {
        this.trazeni_broj_bodova = trazeni_broj_bodova;
    }

    public Set<Kupac> getKupac() {
        return kupci;
    }

    public void setKupac(Kupac kupac) {
        this.kupci = kupci;
    }



    @Override
    public String toString() {
        return "TipKupca{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", popust=" + popust +
                ", trazeni_broj_bodova=" + trazeni_broj_bodova +
                '}';
    }
}
