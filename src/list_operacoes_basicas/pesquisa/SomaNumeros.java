package list_operacoes_basicas.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}

	public int calcularSoma() {
		int soma = 0;
		if (!numeros.isEmpty()) {
			for (Integer num : numeros) {
				soma = soma + num;
			}
		}else {
			throw new RuntimeException("A lista está vazia !");
		}
		return soma;

	}

	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer num : numeros) {
				if (num > maior) {
					maior = num;
				}
			}
		}else {
			throw new RuntimeException("A lista está vazia !");
		}
		return maior;

	}

	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer num : numeros) {
				if (num < menor) {
					menor = num;
				}
			}
		}else {
			throw new RuntimeException("A lista está vazia !");
		}
		return menor;
	}

	public void exibirNumeros() {
		System.out.println(this.numeros);
	}

}