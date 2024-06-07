package List.Pesquisa.Livros;

public class Livro {

    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;


    @Override
    public String toString() {
        return "Livro{" +
                "tituloLivro='" + tituloLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public Livro(String tituloLivro, String autorLivro, int anoPublicacao) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
