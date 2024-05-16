package list_operacoes_basicas.ordenacao;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas(null);
		
		ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(ordenacaoPessoas.pessoaList);
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}

}
