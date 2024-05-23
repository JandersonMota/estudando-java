package tema.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> numerosList = new ArrayList();

   public OrdenacaoNumeros() {
   }

   public void adicionarNumero(int numero) {
      this.numerosList.add(numero);
   }

   public List<Integer> ordenarAscendente() {
      List<Integer> numerosAscendente = new ArrayList(this.numerosList);
      if (!this.numerosList.isEmpty()) {
         Collections.sort(numerosAscendente);
         return numerosAscendente;
      } else {
         throw new RuntimeException("A lista est\u00e1 vazia!");
      }
   }

   public List<Integer> ordenarDescendente() {
      List<Integer> numerosAscendente = new ArrayList(this.numerosList);
      if (!this.numerosList.isEmpty()) {
         numerosAscendente.sort(Collections.reverseOrder());
         return numerosAscendente;
      } else {
         throw new RuntimeException("A lista est\u00e1 vazia!");
      }
   }

   public void exibirNumeros() {
      if (!this.numerosList.isEmpty()) {
         System.out.println(this.numerosList);
      } else {
         System.out.println("A lista est\u00e1 vazia!");
      }

   }
}
