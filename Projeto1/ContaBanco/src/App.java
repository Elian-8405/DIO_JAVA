import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal c1 = new ContaTerminal();
        String Agencia; 
        int Numero; 
        String nomeCliente;
        double deposito; 



        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o numero da Numero da Conta!");
        Numero = input.nextInt();
        c1.setNumero(Numero);
        input.nextLine();
    
        System.out.println("Digite o numero da Agencia!");
        Agencia = input.nextLine();
        c1.setAgencia(Agencia);
       
        
        System.out.println("Digite o seu Nome!");
        nomeCliente = input.nextLine();
        c1.setNomeCliente(nomeCliente);
       
        
        System.out.println("Faça seu primeiro deposito");
        deposito = input.nextDouble();
        c1.setSaldo(deposito);
        input.nextLine();
       
        input.close();


        System.out.println("Agaurde...");

        System.out.println("Olá, " + c1.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é: " + c1.getAgencia()+ " conta: " + c1.getNumero() + " e seu saldo: " + c1.getSaldo() +" já está disponível para saque");

    }
}
