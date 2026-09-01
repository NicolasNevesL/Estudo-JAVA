 package modificadorDeAcesso.dominio;

public class Series {

    private String nome;
    private int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização Static 1");
    }

    static {
        System.out.println("Dentro do bloco de inicialização Static 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização Static 3");
    }


    {
        System.out.println("Dentro do Bloco de inicialização");
        episodios = new int[8];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Series(String nome) {
        this.nome = nome;
    }

    public Series() {
        for (int episodios: this.episodios) {
            System.out.println(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
