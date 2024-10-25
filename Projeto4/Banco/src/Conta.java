public class Conta {
    //Constatntes
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    //Construtor
    public Conta (Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    //Gets
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    //Métodos
    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        this.saldo -= saldo;
    }


    public void transferir(double saldo, Conta c){
        if(c != null){
            this.sacar(saldo);
            c.depositar(saldo);
        }

    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %d", this.saldo));

    }

    @Override
    public String toString() {
        return "Conta{" +
                " cliente=" + cliente +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                '}';
    }
}
