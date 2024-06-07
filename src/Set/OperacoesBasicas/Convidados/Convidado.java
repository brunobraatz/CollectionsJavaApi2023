package Set.OperacoesBasicas.Convidados;

import java.util.Objects;

public class Convidado {

    private String nomeConvidado;
    private int codConvite;

    public Convidado(String nomeConvidado, int codConvite) {
        this.nomeConvidado = nomeConvidado;
        this.codConvite = codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nomeConvidado='" + nomeConvidado + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }
}
