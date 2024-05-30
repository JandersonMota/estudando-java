package tema.map.operacoes_basicas.agenda;

public class App {
  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Camila", 5665);
    agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
    agendaContatos.adicionarContato("Camila Dio", 654987);
    agendaContatos.adicionarContato("Maria Silva", 1111111);
    agendaContatos.adicionarContato("Camila", 44444);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Maria Silva");
    agendaContatos.exibirContatos();

    System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila Dio"));
  }
}
