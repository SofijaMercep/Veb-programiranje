package web.projekat.web.entity.DTO;

public class LogovanjeDTO {

    private String username;
    private String password;

    public LogovanjeDTO() {
    }

    public LogovanjeDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
}
