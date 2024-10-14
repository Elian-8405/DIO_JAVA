import list.CarrinhoDeCompras.CarrinhoDeCompras;
import list.ListaTarefas.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
       CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

       carrinhoDeCompras.adicionarItem("Carro", 10, 3);
       carrinhoDeCompras.adicionarItem("Dentadura", 8, 1);
       carrinhoDeCompras.adicionarItem("Vassoura", 5, 4);
       carrinhoDeCompras.adicionarItem("Video Game", 15, 4);
       carrinhoDeCompras.exibirItens();
       System.out.println("Valor Total: " + carrinhoDeCompras.calcularValorTotal());
       carrinhoDeCompras.removerItem("Video Game");
       System.out.println("Valor Total pos Remocao: " + carrinhoDeCompras.calcularValorTotal());
       

       
       
       

      
    }
}
