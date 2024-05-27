package tema.set.pesquisa.agenda_contatos;

import java.util.Objects;

public class Contato {
  private String nome;
  private int numero;

  public Contato(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return this.nome;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Contato) {
      Contato contato = (Contato)o;
      return Objects.equals(this.getNome(), contato.getNome());
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects.hash(new Object[]{this.getNome()});
  }

  public String toString() {
    return "{" + this.nome + "," + this.numero + "}";
  }
}
