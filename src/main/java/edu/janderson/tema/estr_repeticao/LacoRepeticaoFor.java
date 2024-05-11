package main.java.edu.janderson.tema.estr_repeticao;

class LacoRepeticaoFor {
  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for(int x = 0; x < alunos.length; x++) {
      System.out.println("Nome do aluno é: " + alunos[x]);
    }
    
    System.out.println("\n\n===========================\n\n");
    /**
     * <h1>forEach</h1>
     * O uso do <b>foreach</b> está fortemente relacionado com um cenário onde contenha um
     * array ou coleção, e assim, a interação é baseada aos elementos da coleção.
     */
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}