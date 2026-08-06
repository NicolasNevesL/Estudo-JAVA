package arrays;

public class Foreach {
    public static void main(String[] args) {
        // 3 Formas de Inicialização de Arrays
        int [] numeros1 = new int[]{1,2,3,4,5};
        int [] numeros2 = {5,4,3,2,1};
        int [] numeros3 = new int[3];

        // Foreach
        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
