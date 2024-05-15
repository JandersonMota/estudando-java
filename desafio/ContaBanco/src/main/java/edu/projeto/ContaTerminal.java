package conta_banco;

public class ContaTerminal {
  private String nome;
  private String agencia;
  private double saldo;
  private int numero;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}
