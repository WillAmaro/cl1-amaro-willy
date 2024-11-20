package pe.edu.i201221362.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201221362.dominio.country;

public class JPARemove {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblical");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        country country = em.find(country.class, "XXX");
        if (country != null) {
            em.remove(country);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
