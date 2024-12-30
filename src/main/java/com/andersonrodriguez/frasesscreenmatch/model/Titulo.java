package com.andersonrodriguez.frasesscreenmatch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "titulos")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personaje;
    private String poster;

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getPoster() {
        return poster;
    }
}
