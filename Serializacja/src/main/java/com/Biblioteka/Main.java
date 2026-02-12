package com.Biblioteka;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        List<Ksiazka> lista = new ArrayList<>();
        lista.add(new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 1993, true));
        lista.add(new Ksiazka("1984", "George Orwell", 1949, false));
        lista.add(new Ksiazka("Solaris", "Stanisław Lem", 1961, true));

        ObjectMapper mapper = new ObjectMapper();


        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("biblioteka.json"), lista);
        System.out.println("Zapisano książki do pliku biblioteka.json");


        List<Ksiazka> odczytana = mapper.readValue(
                new File("biblioteka.json"),
                new TypeReference<List<Ksiazka>>() {}
        );

        System.out.println("\nDostępne książki:");
        for (Ksiazka k : odczytana) {
            if (k.isDostepna()) {
                System.out.println("- " + k.getTytul() + " (" + k.getAutor() + ", " + k.getRokWydania() + " " + k.isDostepna() + ")");
            }
        }
    }
}
