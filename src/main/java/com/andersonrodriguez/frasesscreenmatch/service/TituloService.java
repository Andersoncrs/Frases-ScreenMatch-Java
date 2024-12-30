package com.andersonrodriguez.frasesscreenmatch.service;

import com.andersonrodriguez.frasesscreenmatch.dto.TituloDto;
import com.andersonrodriguez.frasesscreenmatch.model.Titulo;
import com.andersonrodriguez.frasesscreenmatch.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class TituloService {
    Random random = new Random();

    @Autowired
    private TituloRepository tituloRepository;

    public TituloDto obtenerFrase() {
        Titulo titulo = tituloRepository.obtenerRegistroAleatorio();
        return new TituloDto(
                titulo.getTitulo(),
                titulo.getFrase(),
                titulo.getPersonaje(),
                titulo.getPoster());
    }
}

