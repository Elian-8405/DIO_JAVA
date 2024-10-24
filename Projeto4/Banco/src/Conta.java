public class Conta {



    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        this.saldo -= saldo;
    }

    public void transferir(double saldo, Conta c){
        this.sacar(saldo);
        c.depositar(saldo);
    }

}
