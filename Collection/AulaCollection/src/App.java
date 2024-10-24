import list.CarrinhoDeCompras.CarrinhoDeCompras;
import list.ListaTarefas.ListaTarefas;
import list.Pesquisa.CatalogoLivro;

public class App {
    public static void main(String[] args) throws Exception {
       CatalogoLivro catalogo = new CatalogoLivro();

       catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
       catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
       catalogo.adicionarLivro("Livro 2", "Autor 1", 2022);

       catalogo.exibirLivro();
       

       

      
    }
}
