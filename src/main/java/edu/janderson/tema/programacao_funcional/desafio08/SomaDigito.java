package main.java.edu.janderson.tema.programacao_funcional.desafio08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Desafio 8 - Somar os dígitos de todos os números da lista.
// TODO: Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class SomaDigito {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
     * 1. 'numeros.stream()': Converte a lista numeros em um stream de elementos.
    */
    double somaDosDigitos = numeros.stream()
                                  .flatMapToInt(n -> Integer.toString(n).chars())
                                  .map(Character::getNumericValue)
                                  .sum();
    
    System.out.println("A soma dos digitos: " + somaDosDigitos);
  }
}
