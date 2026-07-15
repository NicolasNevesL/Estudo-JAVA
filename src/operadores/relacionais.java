package operadores;

public class relacionais {
    public static void main(String[] args) {
        // %
        int resto = 25 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezMenorIgualDez = 10 <= 10;
        boolean isDezMaiorIgualDez = 10 <= 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezMenorIgualDez "+isDezMenorIgualDez);
        System.out.println("isDezMaiorIgualDez "+isDezMaiorIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

    }
}
