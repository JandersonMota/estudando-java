package tema.map.operacoes_basicas.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap();
  }

  public void adicionarContato(String nome, Integer telefone) {
    this.agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!this.agendaContatoMap.isEmpty()) {
      this.agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda de contatos est\u00e1 vazia.");
    }
  }

  public void exibirContatos() {
    if (!this.agendaContatoMap.isEmpty()) {
      System.out.println(this.agendaContatoMap);
    } else {
      System.out.println("A agenda de contatos est\u00e1 vazia.");
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!this.agendaContatoMap.isEmpty()) {
      numeroPorNome = (Integer)this.agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato n\u00e3o encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos est\u00e1 vazia.");
    }
    return numeroPorNome;
  }
}
