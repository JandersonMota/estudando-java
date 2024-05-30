package tema.map.pesquisa.estoque;

public class App {
  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutosMap = new EstoqueProdutos();

    estoqueProdutosMap.exibirProdutos();

    estoqueProdutosMap.adicionarProduto(0001, "carro", 10, 34.0);
    estoqueProdutosMap.adicionarProduto(0002, "moto", 20, 15.0);
    estoqueProdutosMap.adicionarProduto(0003, "avião", 30, 25.0);

    estoqueProdutosMap.exibirProdutos();

    System.out.println("\nValor total do estoque (R$): " + estoqueProdutosMap.calcularValorTotalEstoque());
    System.out.println("\nProduto mais caro: " + estoqueProdutosMap.obterProdutoMaisCaro());
    System.out.println("\nProduto mais barato: " + estoqueProdutosMap.obterProdutoMaisBarato());
    System.out.println("\nProduto de maior valor total do estoque: " + estoqueProdutosMap.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }
}
