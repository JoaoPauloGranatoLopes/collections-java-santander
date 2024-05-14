package list_operacoes_basicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	//atributo
	private List<Tarefa> tarefaList;

//construtor
	public ListaTarefas(List<Tarefa> tarefaList) {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);

	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {

		System.out.println(tarefaList);

	}

}