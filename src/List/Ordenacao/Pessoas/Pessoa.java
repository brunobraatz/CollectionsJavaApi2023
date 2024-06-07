package List.Ordenacao.Pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

    private String nomePessoa;
    private int idadePessoa;
    private double alturaPessoa;

    public Pessoa(String nomePessoa, int idadePessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.alturaPessoa = alturaPessoa;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idadePessoa, p.getIdadePessoa());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                ", alturaPessoa=" + alturaPessoa +
                '}';
    }


    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public double getAlturaPessoa() {
        return alturaPessoa;
    }

    public void setAlturaPessoa(double alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }


}

class ComparatorPorAltura implements Comparator<Pessoa> {


    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlturaPessoa(), p2.getAlturaPessoa());
    }
}
