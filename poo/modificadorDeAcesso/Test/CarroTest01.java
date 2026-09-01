package modificadorDeAcesso.Test;

import modificadorDeAcesso.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("BMW", 270);
        Carro c3 = new Carro("BMW", 275);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
