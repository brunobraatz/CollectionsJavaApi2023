package Set.Pesquisa.Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void acicionarContato(String nome, int numero){
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){

        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaContatoPorNome = new HashSet<>();
        for(Contato c : setContatos){
            if(c.getNomeContato().startsWith(nome)){
                pesquisaContatoPorNome.add(c);
            }
        }
        return pesquisaContatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;
        for(Contato c : setContatos){
            if(c.getNomeContato().equalsIgnoreCase(nome)){
                c.setNumTelefoneContato(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.acicionarContato("Camila", 123456);
        agendaContatos.acicionarContato("Camila", 0);
        agendaContatos.acicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.acicionarContato("Camila DIO", 654987);
        agendaContatos.acicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado! "
                + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
    }
}
