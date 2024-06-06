package desafio.DesafioDoBanco.src;

public class Main {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.setNome("Janderson");

    Conta cc = new ContaCorrente(cliente1);
    Conta poupanca = new ContaPoupanca(cliente1);

    cc.depositar(100);
    poupanca.depositar(50);

    cc.transferir(30, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
