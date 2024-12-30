package com.andersonrodriguez.frasesscreenmatch.repository;

import com.andersonrodriguez.frasesscreenmatch.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

    @Query(value = "SELECT t FROM Titulo As t ORDER BY function('RANDOM') LIMIT 1")
    Titulo obtenerRegistroAleatorio();

}
