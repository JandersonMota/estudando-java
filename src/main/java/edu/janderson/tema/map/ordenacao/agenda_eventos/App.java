package tema.map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.time.Month;

public class App {
  public static void main(String[] args) {
    AgendaEventos agenda = new AgendaEventos();

    agenda.adicionarEvento(LocalDate.of(2024, 05, 30), "Evento 01", "Atração 01");
    agenda.adicionarEvento(LocalDate.of(2021, 01, 15), "Evento 02", "Atração 02");
    agenda.adicionarEvento(LocalDate.of(2024, Month.JUNE, 8), "Evento 03", "Atração 03");
    agenda.adicionarEvento(LocalDate.of(2025, Month.OCTOBER, 21), "Evento 04", "Atração 04");

    agenda.exibirAgenda();

    System.out.println("\n");
    agenda.obterProximoEvento();
  }
}
