package tema.map.pesquisa.estoque;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(this.estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0.0;
    Produto p;
    if (!this.estoqueProdutosMap.isEmpty()) {
      for(Iterator var3 = this.estoqueProdutosMap.values().iterator(); var3.hasNext(); valorTotalEstoque += (double)p.getQuantidade() * p.getPreco()) {
        p = (Produto)var3.next();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    Iterator var4 = this.estoqueProdutosMap.values().iterator();

    while(var4.hasNext()) {
      Produto p = (Produto)var4.next();
      if (p.getPreco() > maiorPreco) {
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    Iterator var4 = this.estoqueProdutosMap.values().iterator();

    while(var4.hasNext()) {
      Produto p = (Produto)var4.next();
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0.0;
    if (!this.estoqueProdutosMap.isEmpty()) {
      Iterator var4 = this.estoqueProdutosMap.entrySet().iterator();

      while(var4.hasNext()) {
        Map.Entry<Long, Produto> entry = (Map.Entry)var4.next();
        double valorProdutoEmEstoque = ((Produto)entry.getValue()).getPreco() * (double)((Produto)entry.getValue()).getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = (Produto)entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }
}
