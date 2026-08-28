package construtores.dominio;

public class Jogos2 {

    private String nome;
    private String plataforma;
    private int edicao;
    private String genero;
    private String estudio;

    public Jogos2(String nome, String plataforma, int edicao, String genero) {
        this();
        this.nome = nome;
        this.plataforma = plataforma;
        this.edicao = edicao;
        this.genero = genero;
    }

    public Jogos2(String nome, String plataforma, int edicao, String genero, String estudio) {
        this(nome, plataforma, edicao, genero);
        this.estudio = estudio;
    }

    public Jogos2(){
        System.out.println("Dentro do construtor sem argumentos.");
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
