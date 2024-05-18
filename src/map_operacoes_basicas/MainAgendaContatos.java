package map_operacoes_basicas;

public class MainAgendaContatos {

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila", 123456789);
	    agendaContatos.adicionarContato("Camila", 987654321);
	    agendaContatos.adicionarContato("Camila Cavalcante", 55555555);
	    agendaContatos.adicionarContato("Camila DIO", 88889999);
	    agendaContatos.adicionarContato("Maria Silva", 77778888);
	    agendaContatos.adicionarContato("Camila", 55555555);
	    
	    agendaContatos.exibirContatos();
	    agendaContatos.removerContato("Maria Silva");
	    agendaContatos.exibirContatos();
	}

}
