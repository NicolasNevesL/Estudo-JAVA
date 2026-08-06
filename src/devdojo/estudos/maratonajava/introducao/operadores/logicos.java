package operadores;

public class logicos {
    public static void main(String[] args) {
        // && (AND) || (Or) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 100;
        double contaPoupanca = 700;
        float valorGTA6 = 550F;
        boolean isGTA6compravel = contaCorrente >= valorGTA6 || contaPoupanca >= valorGTA6;
        System.out.println("isGTA6compravel "+isGTA6compravel);
    }
}
