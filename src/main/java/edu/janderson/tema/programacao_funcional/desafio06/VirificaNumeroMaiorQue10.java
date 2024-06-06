package main.java.edu.janderson.tema.programacao_funcional.desafio06;

import java.util.Arrays;
import java.util.List;

// TODO: Desafio 6 - Verificar se a lista contém algum número maior que 10.
// TODO: Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class VirificaNumeroMaiorQue10 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Converte a lista numeros em um stream de elementos.
     * 2. 'anyMatch()' verifica se pelo menos um elemento satisfaz a condição, ou seja, se há pelo menos um número (n > 10).
     */
    boolean numeroMiorQue10 = numeros.stream()
                                    .anyMatch(n -> n > 10);

    System.out.println("Tem numero maior que 10? " + numeroMiorQue10);
  }
}
