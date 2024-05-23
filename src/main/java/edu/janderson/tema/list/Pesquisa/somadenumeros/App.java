package tema.list.Pesquisa.somadenumeros;

public class App {
  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(3);

    System.out.println("Soma: " + somaNumeros.calcularSoma());
    System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
    System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    System.out.println("Números: " + somaNumeros.exibirNumeros());
  }
}
