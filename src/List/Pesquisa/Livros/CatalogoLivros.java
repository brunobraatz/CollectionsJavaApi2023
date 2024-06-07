package List.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaDeLivros;

    public CatalogoLivros(){
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List pesquisarPorAutor(String autor){

        List<Livro> listaLivrosPorAutor = new ArrayList<>();
        if(!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getAutorLivro().equalsIgnoreCase(autor)) {
                    listaLivrosPorAutor.add(l);
                }
            }
        }

        return listaLivrosPorAutor;
    }

    public List pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> listaLivrosPorIntervalo = new ArrayList<>();
        if(!listaDeLivros.isEmpty()) {
            for(Livro l : listaDeLivros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaLivrosPorIntervalo.add(l);
                }
            }
        }
        return listaLivrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro listaLivroPorTitulo = null;
        if(!listaDeLivros.isEmpty()){
            for(Livro l : listaDeLivros){
                if(l.getTituloLivro().equalsIgnoreCase(titulo)){
                    listaLivroPorTitulo = l;
                    break;
                }
            }
        }
        return listaLivroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 1994);

        //Pesquisa por autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));

        //Pesquisa por intervalo de anos
       System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2000));

        //Pesquisa por título - Mostra apenas o primeiro resultado da lista, mesmo que existam dois livros
        //com o mesmo nome na lista.
       System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
    }

}
