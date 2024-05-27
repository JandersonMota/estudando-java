package tema.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private String nome;
  private long cod;
  private double preco;
  private int quantidade;

  public Produto(String nome, long cod, double preco, int quantidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }

  public String getNome() {
    return nome;
  }

  public long getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Produto) {
      Produto produto = (Produto)o;
      return this.getCod() == produto.getCod();
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(new Object[]{this.getCod()});
  }

  @Override
  public String toString() {
    return "Produto{" +
          "nome=" + this.nome +
          ", cod=" + this.cod +
          ", preco=" + this.preco +
          ", quantidade=" + this.quantidade +
          '}';
  }
}

class ComparatorPorpreco implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
    
}