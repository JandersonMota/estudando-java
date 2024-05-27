package tema.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    this.produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> nomesDosProdutos = new TreeSet<>(this.produtoSet);
    return nomesDosProdutos;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> precosDosProdutos = new TreeSet<>(new ComparatorPorpreco());
    precosDosProdutos.addAll(this.produtoSet);
    return precosDosProdutos;
  }

  @Override
  public String toString() {
    return "Cadastro do Produto [produtoSet=" + this.produtoSet + "]";
  }
}
