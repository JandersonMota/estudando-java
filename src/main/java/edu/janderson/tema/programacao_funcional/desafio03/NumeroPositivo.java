package main.java.edu.janderson.tema.programacao_funcional.desafio03;

import java.util.Arrays;
import java.util.List;

// TODO: Desafio 3 - Verifique se todos os números da lista são positivos.
// TODO: Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
public class NumeroPositivo {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Converte a lista numeros em um stream de elementos.
     * 2. '.allMatch(n -> n > 0)': Utiliza o método allMatch() do stream para verificar se todos os elementos são maiores que zero. Este método retorna true se todos os elementos no stream satisfazem a condição especificada, e false caso contrário. O método 'allMatch()' verifica se todos os elementos da stream satisfazem a condição especificada.
     */
    boolean numerosPositivos = numeros.stream()
                                      .allMatch(n -> n > 0);
    
    System.out.println("Todos os números são positivos? " + numerosPositivos);
  }
}
