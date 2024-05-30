package tema.map.pesquisa.estoque;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return this.nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public String toString() {
    return "Produto{nome='" + this.nome + "', preco=" + this.preco + ", quantidade=" + this.quantidade + "}";
  }
}
