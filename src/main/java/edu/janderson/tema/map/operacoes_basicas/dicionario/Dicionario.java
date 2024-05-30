package tema.map.operacoes_basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    this.dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!this.dicionarioMap.isEmpty()) {
      this.dicionarioMap.remove(palavra);
    } else {
      System.out.println("O dicionario est\u00e1 vazia.");
    }
  }

  public void exibirPalavras() {
    System.out.println(this.dicionarioMap);
  }

  public String pesquisarPorPalavra(String palavra) {
    String palavraPesquisada = null;
    if (!this.dicionarioMap.isEmpty()) {
      palavraPesquisada = this.dicionarioMap.get(palavra);
      if (palavraPesquisada == null) {
        throw new RuntimeException(palavra + " n\u00e3o encontrado na agenda.");
      }
    } else {
      throw new RuntimeException("O dicionario de contatos est\u00e1 vazia.");
    }
    return palavraPesquisada;
  }
}
