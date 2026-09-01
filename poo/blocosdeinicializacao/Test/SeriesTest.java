package blocosdeinicializacao.Test;

import blocosdeinicializacao.Dominio.Series;

public class SeriesTest {
    public static void main(String[] args) {
        Series series = new Series();

        for (int episodios : series.getEpisodios()) {
            System.out.println(episodios + " ");
        }
    }
}
