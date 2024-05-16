package list_operacoes_basicas.pesquisa;

import java.util.ArrayList;

public class MainSoma {

	public static void main(String[] args) {

		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(10);
		somaNumeros.adicionarNumero(20);
		somaNumeros.adicionarNumero(30);
		somaNumeros.adicionarNumero(5);
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(25);
		
		System.out.println("calculando a soma: " + somaNumeros.calcularSoma());;
		System.out.println("retornando o maior: " + somaNumeros.encontrarMaiorNumero());
		System.out.println("retornando o menor: " + somaNumeros.encontrarMenorNumero());
		somaNumeros.exibirNumeros();
	}



}
