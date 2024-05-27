package tema.set.operacoes_basicas.conjunto_convidados;

import java.util.Objects;

public class Convidado {
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return this.nome;
  }

  public int getCodigoConvite() {
    return this.codigoConvite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Convidado) {
      Convidado convidado = (Convidado)o;
      return this.getCodigoConvite() == convidado.getCodigoConvite();
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(new Object[]{this.getCodigoConvite()});
  }

  public String toString() {
    return "Convidado{nome='" + this.nome + "', codigoConvite=" + this.codigoConvite + "}";
  }
}
