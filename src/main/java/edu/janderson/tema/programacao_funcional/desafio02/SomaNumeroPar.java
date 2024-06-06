package main.java.edu.janderson.tema.programacao_funcional.desafio02;

import java.util.Arrays;
import java.util.List;

// TODO: Desafio 2 - Imprima a soma dos números pares da lista.
// TODO: Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class SomaNumeroPar {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Cria um stream a partir da lista de números.
     * 2. 'filter(n -> n % 2 == 0)': Filtra apenas os números pares.
     * 3. 'mapToInt(Integer::intValue)': Mapeia os valores inteiros do stream para int (necessário para usar o método sum).
     * 4. 'sum()': Soma todos os valores do stream resultante.
     * 5. 'System.out.println("A soma dos números pares é: " + somaPares)': Exibe o resultado da soma no console.
     */
    int somaPares = numeros.stream()
                          .filter(n -> n % 2 == 0)
                          .mapToInt(Integer::intValue)
                          .sum();
    
    System.out.println("A soma dos números pares é: " + somaPares);
  }
}
