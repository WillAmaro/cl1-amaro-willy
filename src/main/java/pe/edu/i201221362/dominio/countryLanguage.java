package pe.edu.i201221362.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class countryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country country;
    private Boolean isOfficial;
    private String language;
    private Float percentage;

    // Getters y Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public pe.edu.i201221362.dominio.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.i201221362.dominio.country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
