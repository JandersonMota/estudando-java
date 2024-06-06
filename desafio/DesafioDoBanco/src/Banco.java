package desafio.DesafioDoBanco.src;

import java.util.HashSet;
import java.util.Set;

public class Banco {
  private Set<Conta> contas;

  public Banco() {
    this.contas = new HashSet<>();
  }
}
