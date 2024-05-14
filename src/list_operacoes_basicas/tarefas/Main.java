package list_operacoes_basicas.tarefas;

public class Main {

	public static void main(String[] args) {
		
		ListaTarefas listaTarefa = new ListaTarefas(null);
		System.out.println("O número total de elementos na lista é: "
				+ listaTarefa.obterNumeroTotalTarefas()
				);
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista é: "
				+ listaTarefa.obterNumeroTotalTarefas()
				);	
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: "
				+ listaTarefa.obterNumeroTotalTarefas()
				);
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("O número total de elementos na lista é: "
				+ listaTarefa.obterNumeroTotalTarefas()
				);
		listaTarefa.removerTarefa("Tarefa ");
		System.out.println("O número total de elementos na lista é: "
				+ listaTarefa.obterNumeroTotalTarefas()
				);
		listaTarefa.obterDescricoesTarefas();
	}
		
}


