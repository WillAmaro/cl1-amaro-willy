package pe.edu.i201221362.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;





    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country country;
    private String name;
    private String district;
    private Integer population;




    // Getters y Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public pe.edu.i201221362.dominio.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.i201221362.dominio.country country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}