package tema.enums;

public class SistemaIbge {
  public static void main(String[] args) {
    // Todos os valores do ENUM
    for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
      System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
    }

    // Selecionando um Estado brasileiro específico.
    EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;

    System.out.println("\nNome = " + estado.getNome());
    System.out.println("Sigla = " + estado.getSigla());
    System.out.println("Nome Maiusculo = " + estado.getNomeMaiusculo());
    System.out.println("Cód. do Estado = " + estado.getIbge());
  }
}
