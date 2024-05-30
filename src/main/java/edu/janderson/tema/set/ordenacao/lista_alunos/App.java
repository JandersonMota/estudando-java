package tema.set.ordenacao.lista_alunos;

public class App {
  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    System.out.println(gerenciadorAlunos.toString());

    gerenciadorAlunos.adicionarAluno("Bia", 0002L, 4);
    gerenciadorAlunos.adicionarAluno("Ana", 0001L, 7);
    gerenciadorAlunos.adicionarAluno("Dene", 0004L, 10);
    gerenciadorAlunos.adicionarAluno("Carlos", 0003L, 9);

    System.out.println(gerenciadorAlunos.toString() + "\n");

    gerenciadorAlunos.removerAluno(0004);

    gerenciadorAlunos.exibirAlunosPorNome();

    gerenciadorAlunos.exibirAlunosPorNota();

    gerenciadorAlunos.exibirAlunos();
  }
}
