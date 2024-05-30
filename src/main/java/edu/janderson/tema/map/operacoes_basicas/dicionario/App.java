package tema.map.operacoes_basicas.dicionario;

public class App {
  public static void main(String[] args) {
    Dicionario dicionarioMap = new Dicionario();

    dicionarioMap.exibirPalavras();

    dicionarioMap.adicionarPalavra("proativo", "que visa antecipar futuros problemas, necessidades ou mudanças.");
    dicionarioMap.adicionarPalavra("know-how", "conhecimento de normas, métodos e procedimentos em atividades profissionais, esp. as que exigem formação técnica ou científica.");
    dicionarioMap.adicionarPalavra("humilde", "que não é vaidoso, tem ou manifesta a virtude de conhecer suas próprias limitações.");
    dicionarioMap.exibirPalavras();
    
    System.out.println("\n");
    dicionarioMap.removerPalavra("know-how");
    dicionarioMap.exibirPalavras();

    System.out.println("\n");
    System.out.println("Resultado da pesquisa: " + dicionarioMap.pesquisarPorPalavra("proativo"));
  }
}
