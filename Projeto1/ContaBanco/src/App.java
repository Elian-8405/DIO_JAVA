import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal c1 = new ContaTerminal();
        String Agencia; 
        int Numero; 
        String nomeCliente;
        float deposito; 



        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o numero da Numero da Conta!\n");
        Numero = input.nextInt();
        c1.setNumero(Numero);
        
        System.out.println("Digite o numero da Agencia!\n");
        Agencia = input.nextLine();
        c1.setAgencia(Agencia);
        
        System.out.println("Digite o seu Nome!\n");
        nomeCliente = input.nextLine();
        c1.setNomeCliente(nomeCliente);
        
        System.out.println("Faça seu primeiro deposito");
        deposito = input.nextFloat();
        c1.setSaldo(deposito);

        System.out.println("Agaurde...");

        System.out.println("Olá," + c1.getNomeCliente() + "obrigado por criar uma conta em nosso banco, sua agência é" + c1.getAgencia()+ "conta" + c1.getNumero() + "e seu saldo" + c1.getSaldo() +"já está disponível para saque");

    }
}
