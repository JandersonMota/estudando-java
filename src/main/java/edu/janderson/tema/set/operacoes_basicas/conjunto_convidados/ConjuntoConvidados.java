package tema.set.operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;
  
  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadosSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    this.convidadosSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    System.out.println(this.convidadosSet);
  }
}
