package tema.list.Ordenacao;

public class App {
  public static void main(String[] args) {
    OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

    ordenacaoNumeros.adicionarNumero(5);
    ordenacaoNumeros.adicionarNumero(10);
    ordenacaoNumeros.adicionarNumero(3);

    System.out.println("Números: " + ordenacaoNumeros.exibirNumeros());
        
    ordenacaoNumeros.ordenarAscendente();
    System.out.println("Números em ordem ascendente: " + ordenacaoNumeros.exibirNumeros());
    
    ordenacaoNumeros.ordenarDescendente();
    System.out.println("Números em ordem descendente: " + ordenacaoNumeros.exibirNumeros());
  }
}
