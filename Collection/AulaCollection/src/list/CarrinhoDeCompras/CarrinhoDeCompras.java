package list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;


    public CarrinhoDeCompras(){
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item : carrinho){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }

        carrinho.removeAll(itensParaRemover);

    }

    public int calcularValorTotal(){
        int valorTotal = 0;
        for(Item item : carrinho){
            valorTotal += (int)item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }


    public void exibirItens(){
        for (Item item : carrinho) {
            System.out.println("Nome: " +item.getNome() + '\n'+ 
                               "Preco: " +item.getPreco() + '\n'+
                               "Quantidade: "+item.getQuantidade());
            
        }

    }

    
}
