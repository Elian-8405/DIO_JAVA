public class ContaTerminal {
   
  
    private int Numero;
    private String Agencia;
    private String nomeCliente;
    private double Saldo;

    public ContaTerminal() {
      
    }


    public String getAgencia() {
        return this.Agencia;
    }

    public void setAgencia(String agencia) {
        this.Agencia = agencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return this.Saldo;
        
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public int getNumero() {
        return this.Numero;
    }

    public void setNumero (int numero){
        this.Numero = numero;
    }
    
}
