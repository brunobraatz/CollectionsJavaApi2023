package Set.Pesquisa.Contatos;

import java.util.Objects;

public class Contato {

    private String nomeContato;
    private int NumTelefoneContato;

    public Contato(String nomeContato, int numTelefoneContato) {
        this.nomeContato = nomeContato;
        NumTelefoneContato = numTelefoneContato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNomeContato(), contato.getNomeContato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeContato());
    }

    @Override
    public String toString() {
        return "Nome: " + nomeContato +
                " - Telefone: " + NumTelefoneContato;

    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public int getNumTelefoneContato() {
        return NumTelefoneContato;
    }

    public void setNumTelefoneContato(int numTelefoneContato) {
        NumTelefoneContato = numTelefoneContato;
    }
}
