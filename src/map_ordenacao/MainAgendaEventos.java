package map_ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class MainAgendaEventos {

	public static void main(String[] args) {

		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 18), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 20), "Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.OCTOBER, 18), "Evento 3", "Atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 13), "Evento 4", "Atracao 4");
		
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
		
	}

}
