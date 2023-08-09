package com.example.desafio5;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class NumeroService {

    public void calcula(DadosNumeros dadosNumeros){
        Assert.isTrue(dadosNumeros.numero().length >= 20, "Você deve fornecer pelo menos 20 numeros!");

        //QUANTIDADE DE DADOS
        for (int i = 0; i < dadosNumeros.numero().length; i++) {
            System.out.println(dadosNumeros.numero()[i]);
        }
        System.out.println("Recebi " + dadosNumeros.numero().length + " números!");

        //CALCULA MÉDIA
        int soma = 0;
        for (int x = 0; x < dadosNumeros.numero().length; x++) {
             soma += dadosNumeros.numero()[x];
        }
        int media = soma / dadosNumeros.numero().length;
        System.out.println("Média dos valores: " + media);

        //CALCULA MEDIANA
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

        System.out.println("A mediana dos numeros é: " + mediana);

        //CALCULA DESVIO PADRÃO
        double quadrado = 0.0;
        for (double a: dadosNumeros.numero()) {
            double diferenca = a - media;
            quadrado += diferenca * diferenca;
        }

        double variancia = quadrado / dadosNumeros.numero().length;
        double desvio = Math.sqrt(variancia);
        System.out.println("O desvio dos valores é: "+ desvio);
    }
}
