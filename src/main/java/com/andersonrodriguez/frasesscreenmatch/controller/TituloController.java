package com.andersonrodriguez.frasesscreenmatch.controller;

import com.andersonrodriguez.frasesscreenmatch.dto.TituloDto;
import com.andersonrodriguez.frasesscreenmatch.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TituloController {

    @Autowired
    TituloService tituloService;

    @GetMapping("/series/frases")
    public TituloDto obtenerFrase(){
        return tituloService.obtenerFrase();
    }
}
