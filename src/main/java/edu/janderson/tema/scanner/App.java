/**
 * <h1>Scanner</h1>
 * Essa classe mostra a funcionalidade da classe Scanner (input ou entrada de dados).
 * 
 * @author  Janderson Mota
 */

package tema.scanner;

import java.util.Locale;
import java.util.Scanner;

class App {
  public static void main(String[] args) {
    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();
    
    System.out.println("Digite seu idade");
    int idade = scanner.nextInt();
    
    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();
    
    // imprimindo os dados obtidos pelo usuário
    System.out.println("\n========================================");
    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
    System.out.println("Idade " + idade + " anos");
    System.out.println("Minha altura é " + altura + "cm");
  }
}