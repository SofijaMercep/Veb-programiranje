package web.projekat.web.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Porudzbina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private UUID id_narudzbine;

    @Column
    private String datum_i_vreme_porudzbine;

    @Column
    private double cena;

    @Column
    private String ime_kupca;

    @Column
    private String status;

    @OneToMany(mappedBy = "porudzbina", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Artikal> artikli = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Dostavljac dostavljac;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Restoran restoran;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Kupac kupac;

    public Porudzbina() {
    }

    public Porudzbina(Long id, UUID id_narudzbine, String datum_i_vreme_porudzbine, double cena, String ime_kupca, String status, Set<Artikal> artikli, Dostavljac dostavljac, Restoran restoran, Kupac kupac) {
        this.id = id;
        this.id_narudzbine = id_narudzbine;
        this.datum_i_vreme_porudzbine = datum_i_vreme_porudzbine;
        this.cena = cena;
        this.ime_kupca = ime_kupca;
        this.status = status;
        this.artikli = artikli;
        this.dostavljac = dostavljac;
        this.restoran = restoran;
        this.kupac = kupac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getId_narudzbine() {
        return id_narudzbine;
    }

    public void setId_narudzbine(UUID id_narudzbine) {
        this.id_narudzbine = id_narudzbine;
    }

    public String getDatum_i_vreme_porudzbine() {
        return datum_i_vreme_porudzbine;
    }

    public void setDatum_i_vreme_porudzbine(String datum_i_vreme_porudzbine) {
        this.datum_i_vreme_porudzbine = datum_i_vreme_porudzbine;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getIme_kupca() {
        return ime_kupca;
    }

    public void setIme_kupca(String ime_kupca) {
        this.ime_kupca = ime_kupca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Artikal> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikal> artikli) {
        this.artikli = artikli;
    }

    public Dostavljac getDostavljac() {
        return dostavljac;
    }

    public void setDostavljac(Dostavljac dostavljac) {
        this.dostavljac = dostavljac;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
}
