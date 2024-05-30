package tema.set.ordenacao.lista_alunos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    this.alunosSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    Aluno alunoParaRemover = null;
    if (this.alunosSet.isEmpty()) {
      throw new RuntimeException("O conjunto est\u00e1 vazio!");
    } else {
      Iterator var4 = this.alunosSet.iterator();

      while(var4.hasNext()) {
        Aluno a = (Aluno)var4.next();
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }

      this.alunosSet.remove(alunoParaRemover);
      if (alunoParaRemover == null) {
        System.out.println("Matricula n\u00e3o encontrada!");
      }
    }
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(this.alunosSet);
    if (!this.alunosSet.isEmpty()) {
      System.out.println(alunosPorNome);
    } else {
      System.out.println("O conjunto est\u00e1 vazio!");
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    if (!alunosSet.isEmpty()) {
      alunosPorNota.addAll(this.alunosSet);
      System.out.println(alunosPorNota);
    } else {
      System.out.println("O conjunto est\u00e1 vazio!");
    }
  }

  public void exibirAlunos() {
    Set<Aluno> exibindoAluno = new TreeSet(this.alunosSet);
    if (!this.alunosSet.isEmpty()) {
      exibindoAluno.addAll(alunosSet);
      System.out.println(exibindoAluno);
    } else {
      System.out.println("O conjunto est\u00e1 vazio!");
    }
  }

  @Override
  public String toString() {
    return "ConjuntoAlunos{" + this.alunosSet + "}";
  }
}
