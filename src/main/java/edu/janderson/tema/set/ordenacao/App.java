package tema.set.ordenacao;

public class App {
  public static void main(String[] args) {
    CadastroProdutos cadastro = new CadastroProdutos();

    cadastro.adicionarProduto(001, "Abacaxi", 7.00, 30);
    cadastro.adicionarProduto(002, "Damasco", 4.50, 25);
    cadastro.adicionarProduto(003, "Cacau", 3.80, 16);
    cadastro.adicionarProduto(004, "Banana", 2.30, 12);

    System.out.println("Produto da lista: " + cadastro.produtoSet);

    System.out.println("\nProduto por nome: " + cadastro.exibirProdutosPorNome());

    System.out.println("\nProduto por preço (R$): " + cadastro.exibirProdutosPorPreco());
  }
}
