package pe.edu.i201221362.generation;

import jakarta.persistence.Persistence;

public class JPAGeneration {

    public static void main(String[] args) {

        // regenerar schema
        Persistence.generateSchema("biblioteca", null);

    }

}