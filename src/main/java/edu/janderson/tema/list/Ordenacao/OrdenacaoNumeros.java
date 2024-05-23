package tema.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> numeros;

  public OrdenacaoNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public void ordenarAscendente() {
    Collections.sort(this.numeros);
  }

  public void ordenarDescendente() {
    Collections.sort(this.numeros, Collections.reverseOrder());
  }

  public List<Integer> exibirNumeros() {
    return this.numeros;
  }
}
