//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("Elia");
        Cliente cliente2 = new Cliente("Cliente2");

        Conta pupanca = new ContaPoupanca(cliente1);
        Conta cc = new ContaCorrente(cliente1);

        cc.depositar(1000);
        cc.transferir(500, pupanca);

        Conta cc1 = new ContaCorrente(cliente2);
        Conta poupanca1 = new ContaCorrente(cliente2);

        cc1.depositar(1000);
        cc1.transferir(500, poupanca1);


        banco.cadastrarConta(cc);
        banco.cadastrarConta(pupanca);
        banco.cadastrarConta(cc1);
        banco.cadastrarConta(poupanca1);
        banco.listarContas();

    }
}