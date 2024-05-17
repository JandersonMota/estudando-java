package tema.enums;

public class SistemaIbge {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
      System.out.println(e.getSigla() + " - " + e.getNome());
    }

    EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;

    System.out.println("\nNome = " + estado.getNome());
    System.out.println("Sigla = " + estado.getSigla());
    System.out.println("Nome Maiusculo = " + estado.getNomeMaiusculo());
  }
}
