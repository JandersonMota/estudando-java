package tema.list.Pesquisa.CatalogoLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livros;

  public CatalogoLivros() {
    this.livros = new ArrayList<Livro>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    this.livros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro autorDoLivros : livros) {
        if (autorDoLivros.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(autorDoLivros);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro anoDoLivro : livros) {
        if (anoDoLivro.getAnoDePublicacao() >= anoInicial && anoDoLivro.getAnoDePublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(anoDoLivro);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }

  public List<Livro> pesquisarPorTitulo(String titulo) {
    List<Livro> livrosPorTitulo = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro tituloDoLivro : livros) {
        if(tituloDoLivro.getTitulo().equalsIgnoreCase(titulo)) {
          livrosPorTitulo.add(tituloDoLivro);
          break;
        }
      }
    }
    return livrosPorTitulo;
  }

  /*public List<Livro> pesquisarPorTitulo(String titulo) {
    List<Livro> livrosPorTitulo = null;
    if (!livros.isEmpty()) {
      for (Livro tituloDoLivro : livros) {
        if(tituloDoLivro.getTitulo().equalsIgnoreCase(titulo)) {
          livrosPorTitulo = tituloDoLivro;
          break;
        }
      }
    }
    return livrosPorTitulo;
  }*/
}
