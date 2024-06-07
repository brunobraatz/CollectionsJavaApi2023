package List.Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){

        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){

        List<Pessoa> listaPessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(listaPessoasPorIdade);

        return listaPessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){

        List<Pessoa> listaPessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(listaPessoasPorAltura, new ComparatorPorAltura());

        return listaPessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
