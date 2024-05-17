package set_operacoes_basicas;

public class MainAgendaContatos {

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos(null);
		
		
		agendaContatos.adicionarContato("Contato 1", 10100);
		agendaContatos.adicionarContato("Contato 2", 10200);
		agendaContatos.adicionarContato("Contato 3", 10300);
		agendaContatos.adicionarContato("Contato 3 Silva", 10400);
		
		agendaContatos.exibirContatos();
		System.out.println(agendaContatos.pesquisarPorNome("Contato 3"));
		System.out.println("Contato atualizado: " 
		+ agendaContatos.atualizarNumeroContato("Contato 3", 10500));
		agendaContatos.exibirContatos();
	}

}
