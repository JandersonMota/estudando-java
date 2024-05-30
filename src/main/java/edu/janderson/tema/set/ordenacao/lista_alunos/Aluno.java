package tema.set.ordenacao.lista_alunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
  private String nome;
  private long matricula;
  private double nota;

  public Aluno(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  @Override
  public int compareTo(Aluno aluno) {
    return this.nome.compareToIgnoreCase(aluno.getNome());
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }
  
  public double getNota() {
    return nota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Aluno) {
      Aluno aluno = (Aluno)o;
      return this.getMatricula() == aluno.getMatricula();
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(new Object[]{this.getMatricula()});
  }

  @Override
  public String toString() {
    return "[Aluno: " + this.getNome() +
    ", Matricula: " + this.getMatricula() +
    ", Nota: " + this.getNota() +
    "]";
  }
}

class ComparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno n1, Aluno n2) {
    return Double.compare(n1.getNota(), n2.getNota());
  }
}
