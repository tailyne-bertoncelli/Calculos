package com.example.desafio5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Numero {
    @Getter @Setter
    private double numero [];

    @Getter @Setter
    private double qntNumeros;

    @Getter @Setter
    private double media;

    @Getter @Setter
    private double mediana;

    @Getter @Setter
    private double desvioPadrao;

    public Numero(double[] numeros) {
        this.numero = numeros;
    }
}
