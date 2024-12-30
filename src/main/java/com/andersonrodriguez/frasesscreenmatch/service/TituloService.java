package com.andersonrodriguez.frasesscreenmatch.service;

import com.andersonrodriguez.frasesscreenmatch.dto.TituloDto;
import com.andersonrodriguez.frasesscreenmatch.model.Titulo;
import com.andersonrodriguez.frasesscreenmatch.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TituloService {

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

