package metodos.test;

import metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaNumeros();
        System.out.println();
        calculadora.subtraiNumeros();
    }
}
