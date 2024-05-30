package tema.map.ordenacao.agenda_eventos;

public class Evento {
  private String evento;
  private String atracao;

  public Evento(String evento, String atracao) {
    this.evento = evento;
    this.atracao = atracao;
  }

  public String getEvento() {
    return evento;
  }
  
  public String getAtracao() {
    return atracao;
  }

  public String toString() {
    return "Evento{evento: " + this.evento + ", atracao: " + this.atracao + " }";
  }
}
