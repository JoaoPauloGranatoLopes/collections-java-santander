package set_operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados(Set<Convidado> convidadoSet) {
		this.convidadoSet = new HashSet<>();
	} 
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		 convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
}
