package tema.list.Ordenacao.OrdenacaoPessoas;

public class App {
  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
  }
}
