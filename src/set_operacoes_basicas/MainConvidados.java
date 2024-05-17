package set_operacoes_basicas;

public class MainConvidados {

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
		
		conjuntoConvidados.exibirConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() 
		+ " convidados dentro do Set. ");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() 
		+ " convidados dentro do Set. ");
		conjuntoConvidados.exibirConvidados();
	}

}
