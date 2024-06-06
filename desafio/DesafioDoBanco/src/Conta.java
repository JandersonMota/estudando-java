package desafio.DesafioDoBanco.src;

import java.util.Objects;

public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int conta;
  protected double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.conta = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    if (this.saldo > 0 && this.saldo >= valor) {
      this.saldo -= valor;
    } else {
      System.err.println("Saldo insuficiente!");
    }
  }
  
  @Override
  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    } else {
      System.err.println("ERRO no valor informado!");
    }
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    if (equals(contaDestino)) {
      contaDestino.depositar(valor);
    }
  }

  protected void imprimirInformacaoDaConta() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Conta: %d", this.conta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Conta) {
      Conta conta = (Conta)o;
      return this.getConta() == conta.getConta();
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(new Object[]{this.getConta()});
  }
}
