package set_operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSubstantivos {

	private Set<String> palavrasUnicasSet;

	public ConjuntoSubstantivos() {
		this.palavrasUnicasSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!palavrasUnicasSet.isEmpty()) {
			if (palavrasUnicasSet.contains(palavra)) {
				palavrasUnicasSet.remove(palavra);
			} else {
				System.out.println("A palavra" + palavra + "não está contida no conjunto.");
			}

		}
	}

	public boolean verificarPalavra(String palavra) {
		return palavrasUnicasSet.contains(palavra);

	}

	public void exibirPalavrasUnicas() {
		System.out.println(palavrasUnicasSet);
	}
}
