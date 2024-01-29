import java.util.Date;

public class Client {
    private String client;
    private String email;
    private Date birthDate;
    public Client(){}

    public Client(String client, String email, Date birthDate) {
        this.client = client;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
