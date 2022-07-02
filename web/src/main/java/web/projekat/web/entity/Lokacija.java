package web.projekat.web.entity;

import javax.persistence.*;

@Entity
public class Lokacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double geo_duzina;

    @Column
    private Double geo_sirina;

    @Column
    private String adresa;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Restoran restoran;

    public Lokacija() {
    }

    public Lokacija( Double geo_duzina, Double geo_sirina, String adresa ) {
        this.geo_duzina = geo_duzina;
        this.geo_sirina = geo_sirina;
        this.adresa = adresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getGeo_duzina() {
        return geo_duzina;
    }

    public void setGeo_duzina(Double geo_duzina) {
        this.geo_duzina = geo_duzina;
    }

    public Double getGeo_sirina() {
        return geo_sirina;
    }

    public void setGeo_sirina(Double geo_sirina) {
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

    @Override
    public String toString() {
        return "Lokacija{" +
                "id=" + id +
                ", duzina=" + geo_duzina +
                ", sirina=" + geo_sirina +
                ", adresa='" + adresa + '\'' +
                '}';
    }

}
