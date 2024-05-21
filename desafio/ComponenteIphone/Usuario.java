package desafio.ComponenteIphone;

public class Usuario {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Pretty woman");

    iphone.ligar("190");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.exibirPagina("www.google.com.br");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    System.out.println("\n\n =====================================\n");

    ReprodutorMusical musica = iphone;

    musica.tocar();
    musica.pausar();
    musica.selecionarMusica("My fight");
    
    AparelhoTelefonico telefone = iphone;

    telefone.ligar("181");
    telefone.atender();
    telefone.iniciarCorreioVoz();

    NavegadorInternet navegador = iphone;

    navegador.exibirPagina("www.youtube.com.br");
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();
  }
}
