package tema.list.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  private List<Pessoa> pessoas;

  public OrdenacaoPessoas() {
    this.pessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    this.pessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoas);
    Collections.sort(pessoaPorIdade);
    return pessoaPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoas);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
  }
}
