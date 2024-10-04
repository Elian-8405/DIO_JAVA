public class ContaTerminal {
   
  
    private int Numero;
    private String Agencia;
    private String nomeCliente;
    private float Saldo;

    public ContaTerminal() {
      
    }


    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public int getNumero() {
        return this.Numero;
    }

    public void setNumero (int numero){
        this.Numero = numero;
    }
    
}
