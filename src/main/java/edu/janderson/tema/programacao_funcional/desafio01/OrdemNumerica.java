import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Desafio 1 - Mostre a lista na ordem numérica.
// TODO: Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
class OrdemNumerica {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. Utilizei o método 'stream()' para criar um fluxo a partir da lista original.
     * 2. Usei o método 'sorted()' para ordenar os elementos do fluxo em ordem crescente.
     * 3. Coletei os elementos ordenados em uma nova lista com o método 'collect(Collectors.toList())'.
     */
    List<Integer> numerosOrdenados = numeros.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
    
    // Imprimimos a nova lista ordenada
    System.out.println(numerosOrdenados);
  }
}