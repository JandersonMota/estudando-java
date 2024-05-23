package tema.list.OperacoesBasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> item;

  public CarrinhoDeCompras() {
    this.item = new ArrayList<Item>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    /*Item itemCriado = new Item(nome, preco, quantidade);
    this.item.add(itemCriado);*/
    this.item.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itemParaRemover = new ArrayList<>();
    for (Item produto : item) {
      if (produto.getNome().equalsIgnoreCase(nome)) {
        itemParaRemover.add(produto);
      }
    }
    item.removeAll(itemParaRemover);
  }

  public double calcularValorTotal() {
    double valorTotalDoCarrinho = 0.0;
    for (Item produto : this.item) {
      valorTotalDoCarrinho += produto.getPreco() * produto.getQuantidade();
    }
    return valorTotalDoCarrinho;
  }

  public void exibirItens() {
    for (Item produto : this.item) {
      System.out.println("Produto: " + produto.getNome() + 
                         "\nPreço (R$): " + produto.getPreco() + 
                         "\nQuantidade: " + produto.getQuantidade());
    }
  }
}
