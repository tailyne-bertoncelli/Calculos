package com.example.desafio5;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Arrays;

@Service
public class NumeroService {

    public Numero calcula(DadosNumeros dadosNumeros){
        Numero numero = new Numero();
        numero.setNumero(dadosNumeros.numero());
        Assert.isTrue(dadosNumeros.numero().length >= 20, "Você deve fornecer pelo menos 20 numeros!");

        numero.setQntNumeros( calculaQntNumeros(dadosNumeros));
        numero.setMedia(calculaMedia(dadosNumeros));
        numero.setMediana(calculaMediana(dadosNumeros));
        numero.setDesvioPadrao(calculaDesvio(dadosNumeros));

        return numero;
    }

    public double calculaDesvio(DadosNumeros dadosNumeros) {
        double media = calculaMedia(dadosNumeros);
        double quadrado = 0.0;
        for (double a: dadosNumeros.numero()) {
            double diferenca = a - media;
            quadrado += diferenca * diferenca;
        }

        double variancia = quadrado / dadosNumeros.numero().length;
        double desvio = Math.sqrt(variancia);

        return desvio;
    }

    public double calculaMediana(DadosNumeros dadosNumeros) {
        double[] crescente = dadosNumeros.numero();
        Arrays.sort(crescente);

        double mediana;
        int tamanho  = dadosNumeros.numero().length;

        if (tamanho % 2 ==0){
            int primeiro = tamanho / 2 - 1;
            int segundo = tamanho / 2;
            mediana = (crescente[primeiro] + crescente[segundo]) / 2;
        } else {
            int impar = tamanho / 2;
            mediana = crescente[impar];
        }
        return mediana;
    }

    public double calculaMedia(DadosNumeros dadosNumeros) {
        double soma = 0;
        for (int x = 0; x < dadosNumeros.numero().length; x++) {
            soma = soma + dadosNumeros.numero()[x];
        }
        double media = soma / dadosNumeros.numero().length;

        return media;
    }

    public double calculaQntNumeros(DadosNumeros dadosNumeros) {
        return dadosNumeros.numero().length;
    }

}
