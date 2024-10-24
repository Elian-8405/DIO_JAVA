package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livrosList;


    public CatalogoLivro(){
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoDePublicacao){
        livrosList.add(new Livro(nome, autor, anoDePublicacao));

    }


    public List<Livro> pesquisaLivros(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro livro : livrosList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> pesquisaPorIntervalo(int anoIncial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            
            for (Livro livro : livrosList) {
                if(livro.getAnoPublicacao() >= anoFinal && livro.getAnoPublicacao() <= anoFinal){
                    livroPorAno.add(livro);
                }
            }
        }
        return livroPorAno;
    }

    public void exibirLivro(){
        System.out.println(livrosList);

    }


}
