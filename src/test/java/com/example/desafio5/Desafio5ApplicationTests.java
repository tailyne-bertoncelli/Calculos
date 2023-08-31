package com.example.desafio5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Desafio5ApplicationTests {

	@Autowired
	private NumeroService numeroService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSomaValores(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var soma = numeroService.somaNumeros(dadosNumeros);
		Assert.assertEquals(905, soma, 0);
	}

	@Test
	public void testMenorValor(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var valor = numeroService.menorValor(dadosNumeros);
		Assert.assertEquals(3, valor, 0);
	}

	@Test
	public void testMaiorValor(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var valor = numeroService.maiorValor(dadosNumeros);
		Assert.assertEquals(96, valor, 0);
	}

	@Test
	public void testQntDados(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var qntDados = numeroService.calculaQntNumeros(dadosNumeros);
		Assert.assertEquals(20, qntDados, 0);
	}

	@Test
	public void testMedia(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var media = numeroService.calculaMedia(dadosNumeros);
		Assert.assertEquals(45.25, media, 0);
	}


	@Test
	public void testMediana(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var mediana = numeroService.calculaMediana(dadosNumeros);
		Assert.assertEquals(43.5, mediana, 0);
	}

	@Test
	public void testDesvioPadrao(){
		double[] numeros = {87, 24, 56, 3, 91, 42, 10, 68, 19, 77, 35, 50, 8, 63, 29, 96, 71, 13, 45, 18};
		DadosNumeros dadosNumeros = new DadosNumeros(numeros);
		var desvio = numeroService.calculaDesvio(dadosNumeros);
		Assert.assertEquals(28.958375299729784, desvio, 0);
	}

}
