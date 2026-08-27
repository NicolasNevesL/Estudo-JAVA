package metodos.test;

import metodos.dominio.Jogos;

public class JogosTest {
    public static void main(String[] args) {
        Jogos jogos = new Jogos();

        jogos.init("Cyberpunk 2077","PS5", 2025, "RPG");
        jogos.imprime();
    }
}
