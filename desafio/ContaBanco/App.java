package desafio.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    ContaTerminal conta = new ContaTerminal();

    System.out.println("Por favor, digite o número da Agência!");
    System.out.println("\nNumero: ");
    conta.setNumero(scanner.nextInt());

    System.out.println("Agência: ");
    conta.setAgencia(scanner.next());

    System.out.println("Nome Cliente: ");
    conta.setNome(scanner.next());

    System.out.println("Saldo: ");
    conta.setSaldo(scanner.nextDouble());

    System.out.println("Olá " + conta.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getAgencia() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
  }
}
