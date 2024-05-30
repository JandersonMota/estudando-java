package tema.map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  Map<LocalDate, Evento> eventoMap;

  public AgendaEventos() {
    this.eventoMap = new HashMap<>();
  }

  public Evento adicionarEvento(LocalDate data, String nome, String atracao) {
    return eventoMap.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventoMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    for (Map.Entry<LocalDate, Evento> entry : this.eventoMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
        break;
      }
    }
  }
}
