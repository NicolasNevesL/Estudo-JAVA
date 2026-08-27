package metodos.dominio;

public class Jogos {
    private String nome;
    private String plataforma;
    private int edicao;
    private String genero;

    public void init(String nome, String plataforma, int edicao) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.edicao = edicao;
    }

    public void init(String nome, String plataforma, int edicao, String genero) {
        this.init(nome, plataforma, edicao);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.plataforma);
        System.out.println(this.edicao);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
