package main.java.edu.janderson.tema.programacao_funcional.desafio07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// TODO: Desafio 7 - Encontrar o segundo número maior da lista.
// TODO: Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class SegundoNumeroMaior {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Converte a lista numeros em um stream de elementos.
     * 2. 'sorted()' para ordenar os elementos do fluxo em ordem crescente.
     *  2.1. '.sorted(Comparator.reverseOrder())': Ordena os elementos em ordem decrescente.
     * 3. '.skip(1)': Pula o primeiro elemento da stream (que será o maior número da lista).
     * 4. '.findFirst()': Retorna o primeiro elemento da stream resultante, que será o segundo número maior.
     * 5. '.orElse(null)': Caso a lista seja vazia ou não haja segundo número maior, retorna null.
     */
    int segundoMaior = numeros.stream()
                                      .sorted(Comparator.reverseOrder())
                                      .skip(1)
                                      .findFirst()
                                      .orElse(null);
    
    System.out.println("Segundo número maior da lista: " + segundoMaior);
  }
}
