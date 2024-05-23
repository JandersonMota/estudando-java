package tema.list.Pesquisa.CatalogoLivro;

public class App {
  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();

    catalogo.adicionarLivro("Engenharia de Software", "Roger Pressman", 1982);
    catalogo.adicionarLivro("Engenharia de Software", "Roger Pressman", 2021);
    catalogo.adicionarLivro("Programação Orientada a Objetos", "Robert C. Martin", 2003);
    catalogo.adicionarLivro("Codigo Limpo", "Robert Cecil Martin", 2008);
    
    System.out.println(catalogo.pesquisarPorAutor("Roger Pressman"));

    System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2009));

    System.out.println(catalogo.pesquisarPorTitulo("Codigo Limpo"));
  }
}
