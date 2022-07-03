package web.projekat.web.entity.DTO;

public class DostavljacDTO {


    private String ime;
    private String prezime;
    private String username;
    private String password;
    private String datumRodjenja;
    private String pol;

    public DostavljacDTO() {
    }

    public DostavljacDTO(String ime, String prezime, String username, String password, String datumRodjenja, String pol) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatumRodjenja() { return datumRodjenja; }

    public void setDatumRodjenja(String datumRodjenja) { this.datumRodjenja = datumRodjenja; }

    public String getPol() { return pol; }

    public void setPol(String pol) { this.pol = pol; }

}
