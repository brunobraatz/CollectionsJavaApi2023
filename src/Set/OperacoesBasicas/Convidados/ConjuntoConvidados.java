package Set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }


    public void adicionaConvidado(String nome, int codigoConvite){
        setConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : setConvidados){
            if(c.getCodConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return setConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(setConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.adicionaConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionaConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionaConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionaConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
