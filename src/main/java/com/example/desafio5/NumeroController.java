package com.example.desafio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numero")
public class NumeroController {

    @Autowired
    private NumeroService numeroService;

    @PostMapping
    public void envia(@RequestBody DadosNumeros dadosNumeros) throws Exception {
        try {
            this.numeroService.calcula(dadosNumeros);
        } catch (Error e){
            throw new Exception(e.getMessage());
        }
    }
}
