package main.java.edu.janderson.tema.programacao_funcional.desafio04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Desafio 4 - Remova todos os valores ímpares.
// TODO: Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
public class removerNumeroImpar {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'filter(n -> n % 2 == 0)': Filtra apenas os números pares.
     * 2. Coletei os elementos ordenados em uma nova lista com o método 'collect(Collectors.toList())'.
     */
    List<Integer> numerosSemImpares = numeros.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());

    System.out.println("Lista sem números ímpares: " + numerosSemImpares);
  }
}
