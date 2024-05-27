package tema.set.pesquisa.agenda_contatos;

public class App {
  public static void main(String[] args) {
    AgendaContatos contatos = new AgendaContatos();

    contatos.exibirContatos();

    contatos.adicionarContato("Jo\u00e3o", 123456789);
    contatos.adicionarContato("Maria", 987654321);
    contatos.adicionarContato("Maria Fernandes", 55555555);
    contatos.adicionarContato("Ana", 88889999);
    contatos.adicionarContato("Fernando", 77778888);
    contatos.adicionarContato("Carolina", 55555555);

    contatos.exibirContatos();

    System.out.println("\nPesquisa: " + contatos.pesquisarPorNome("Maria"));

    contatos.atualizarNumeroContato("Carolina", 44443333);

    contatos.exibirContatos();
  }
}
