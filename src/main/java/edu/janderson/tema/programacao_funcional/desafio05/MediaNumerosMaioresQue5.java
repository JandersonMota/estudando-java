package main.java.edu.janderson.tema.programacao_funcional.desafio05;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// TODO: Desafio 5 - Calcule a média dos números maiores que 5.
// TODO: Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public class MediaNumerosMaioresQue5 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Cria um stream a partir da lista de números.
     * 2. '.filter(n -> n > 5)': Filtra apenas os números maiores que 5.
     * 3. '.mapToDouble(n -> n)': Converte os números inteiros filtrados para 'double', pois o método 'average()' opera em um stream de 'double'.
     * 4. '.average()': Calcula a média dos números no stream (retorna um OptionalDouble).
     */
    OptionalDouble mediaNumerosMaioresque5 = numeros.stream()
                                            .filter(n -> n > 5)
                                            .mapToDouble(n -> n)
                                            .average();
    
    System.out.println("Media dos números maiores que 5: " + mediaNumerosMaioresque5.getAsDouble());
  }
}
