package modificadorDeAcesso.Test;

import modificadorDeAcesso.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("BMW", 270);
        Carro c3 = new Carro("BMW", 275);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
