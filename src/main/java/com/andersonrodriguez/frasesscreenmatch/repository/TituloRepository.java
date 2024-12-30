package com.andersonrodriguez.frasesscreenmatch.repository;

import com.andersonrodriguez.frasesscreenmatch.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

    @Query(value = "SELECT t FROM Titulo As t ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Titulo obtenerRegistroAleatorio();

}
