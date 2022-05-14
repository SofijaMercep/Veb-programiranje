package web.projekat.web.entity;

import javax.persistence.*;

@Entity
public class Lokacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String geo_duzina;

    @Column
    private String geo_sirina;

    @Column
    private String adresa;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Restoran restoran;

    public Lokacija() {
    }

    public Lokacija(Long id, String geo_duzina, String geo_sirina, String adresa, Restoran restoran ) {
        this.id = id;
        this.geo_duzina = geo_duzina;
        this.geo_sirina = geo_sirina;
        this.adresa = adresa;
        this.restoran = restoran;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeo_duzina() {
        return geo_duzina;
    }

    public void setGeo_duzina(String geo_duzina) {
        this.geo_duzina = geo_duzina;
    }

    public String getGeo_sirina() {
        return geo_sirina;
    }

    public void setGeo_sirina(String geo_sirina) {
        this.geo_sirina = geo_sirina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }
}
