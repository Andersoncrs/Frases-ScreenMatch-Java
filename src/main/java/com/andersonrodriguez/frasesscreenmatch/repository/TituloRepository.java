package com.andersonrodriguez.frasesscreenmatch.repository;

import com.andersonrodriguez.frasesscreenmatch.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

    @Query(value = "SELECT COUNT(t) FROM Titulo AS t")
    int cantidadRegistros();

//    @Query(value = "SELECT t FROM Titulo AS t OFFSET :numero LIMIT 0")
//    Titulo capturarObservacion(@Param("numero") int numero);

}
