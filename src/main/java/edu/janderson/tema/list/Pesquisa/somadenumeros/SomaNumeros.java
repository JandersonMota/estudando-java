package tema.list.Pesquisa.somadenumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

  private List<Integer> numeros;
  
  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    for (Integer numero : numeros) {
      soma += numero;
    }
    return soma;
  }

  public int encontrarMaiorNumero() {
    if(this.numeros.isEmpty()) {
      throw new IllegalStateException("A lista está vazia.");
    }
    return Collections.max(this.numeros);
  }

  public int encontrarMenorNumero() {
    if(this.numeros.isEmpty()) {
      throw new IllegalStateException("A lista está vazia.");
    }
    return Collections.min(this.numeros);
  }

  public List<Integer> exibirNumeros() {
    return this.numeros;
  }
}
