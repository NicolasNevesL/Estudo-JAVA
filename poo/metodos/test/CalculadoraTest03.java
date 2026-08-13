package metodos.test;

import metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideNumeros(20, 2);
        System.out.println(resultado);
        System.out.println(calculadora.divideNumeros2(67, 0));
        System.out.println("_____________________");
        calculadora.imprimeDividaNumeros(34, 0);
    }
}
