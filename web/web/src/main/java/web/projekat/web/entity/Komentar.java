package web.projekat.web.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Komentar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int ocena;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Kupac kupac;

    @OneToOne
    private Restoran restoran;

    @Column
    private String text;

    public Komentar() {
    }

    public Komentar(Long id, Kupac kupac, Restoran restoran, String text, int ocena) {
        this.id = id;
        this.kupac = kupac;
        this.restoran = restoran;
        this.text = text;
        this.ocena = ocena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kupac getKupci() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

}
