package pe.edu.i201221362.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201221362.dominio.city;
import pe.edu.i201221362.dominio.country;
import pe.edu.i201221362.dominio.countryLanguage;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblical");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Crear país
        country country = new country();
        country.setCode("XXX");
        country.setName("Ficticia");
        country.setContinent("Antarctica");
        country.setRegion("Fictitious Region");
        country.setPopulation(100000);
        country.setSurfaceArea(5000.0);
        country.setLifeExpectancy(75.0f);
        country.setGnp(10000.0f);
        country.setGnpoId(9500.0f);
        country.setLocalName("Ficticia Local");
        country.setGovernmentForm("Democracy");
        country.setHeadOfState("John Doe");
        country.setCapital(123);
        country.setCode2("FT");

        // Crear ciudades
        city city1 = new city();
        city1.setName("Ciudad1");
        city1.setPopulation(50000);
        city1.setDistrict("Test");
        city1.setCountry(country);

        city city2 = new city();
        city2.setName("Ciudad2");
        city2.setPopulation(30000);
        city2.setDistrict("Test");
        city2.setCountry(country);

        city city3 = new city();
        city3.setName("Ciudad3");
        city3.setDistrict("Test");

        city3.setPopulation(20000);
        city3.setCountry(country);

        // Crear idiomas
        countryLanguage lang1 = new countryLanguage();
        lang1.setLanguage("Balochi");
        lang1.setOfficial(true);
        lang1.setPercentage(10.1f);
        lang1.setCountry(country);

        countryLanguage lang2 = new countryLanguage();
        lang2.setLanguage("Balochi");
        lang2.setOfficial(false);
        lang1.setPercentage(10.1f);

        lang2.setCountry(country);

        // Persistir
        country.getCities().add(city1);
        country.getCities().add(city2);
        country.getCities().add(city3);


        em.persist(country);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
