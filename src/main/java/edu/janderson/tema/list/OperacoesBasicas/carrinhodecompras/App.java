package tema.list.OperacoesBasicas.carrinhodecompras;

public class App {
  public static void main(String[] args) {

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Tenis", 400.0, 1);
    carrinho.adicionarItem("Camisa", 100.0, 2);
    carrinho.adicionarItem("Calça", 200.0, 3);

    carrinho.exibirItens();

    carrinho.removerItem("Calça");
    System.out.println("\n\nItem removido do carrinho.");

    carrinho.exibirItens();

    System.out.println("\n\nValor da compra (R$): " + carrinho.calcularValorTotal());

  }
}
