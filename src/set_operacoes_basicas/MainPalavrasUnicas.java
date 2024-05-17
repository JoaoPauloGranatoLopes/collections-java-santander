package set_operacoes_basicas;

import java.util.HashSet;

public class MainPalavrasUnicas {

	public static void main(String[] args) {

		ConjuntoSubstantivos conjuntoSubstantivos = new ConjuntoSubstantivos();

		conjuntoSubstantivos.adicionarPalavra("foco");
		conjuntoSubstantivos.adicionarPalavra("perseverança");
		conjuntoSubstantivos.adicionarPalavra("dedicação");
		conjuntoSubstantivos.adicionarPalavra("equipe");
		conjuntoSubstantivos.adicionarPalavra("união");
		conjuntoSubstantivos.adicionarPalavra("individualismo");
		
		conjuntoSubstantivos.exibirPalavrasUnicas();
		
		conjuntoSubstantivos.removerPalavra("individualismo");
		conjuntoSubstantivos.exibirPalavrasUnicas();
		
		System.out.println("A palavra 'individualismo está no conjunto? " 
		+ conjuntoSubstantivos.verificarPalavra("individualismo"));
		
		System.out.println("A palavra 'foco' está no conjunto? " 
		+ conjuntoSubstantivos.verificarPalavra("foco"));
	}

}
