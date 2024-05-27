package tema.set.pesquisa.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatosSet;
  
  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    this.contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(this.contatosSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosEncontrados = new HashSet<>();
    for (Contato contato : this.contatosSet) {
      if (contato.getNome() == nome) {
        contatosEncontrados.add(contato);
      }
    }    
    return contatosEncontrados;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for (Contato contato : this.contatosSet) {
      if (contato.getNome().equalsIgnoreCase(nome)) {
        contato.setNumero(novoNumero);
        contatoAtualizado = contato;
        break;
      }
    }
    return contatoAtualizado;
  }

  @Override
  public String toString() {
    return "AgendaContatos [contatosSet=" + this.contatosSet + ", toString()=" + super.toString() + "]";
  }
}
