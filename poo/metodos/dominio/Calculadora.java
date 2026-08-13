package metodos.dominio;

public class Calculadora {
    public void somaNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiNumeros(){
        System.out.println(21 - 2);
    }
    public void multiplicaNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public double divideNumeros2(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }
        System.out.println("Não existe divisão por zero");
        return 0;
    }
    public void imprimeDividaNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
    }
    public void somaArray (int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    int soma = 0;
    public void varArgs (int... numeros){
        for (int num: numeros){
             soma += num;
        }
        System.out.println(soma);
    }
}
