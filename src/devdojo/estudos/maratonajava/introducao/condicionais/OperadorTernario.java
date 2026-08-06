package condicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        // Forma 1 de usar o operador ternário

        // Comprar GTA6 se salário > 500
        double salario = 1000;
        String mensagemGTACompravel = "Consigo comprar o GTA 6 !!!";
        String mensagemGTANaoCompravel = "Não consigo comprar o GTA 6. :(";
        String resultado = (salario > 500) ? mensagemGTACompravel : mensagemGTANaoCompravel;
        System.out.println(resultado);

        // Forma 2 de usar o operador ternário
        //Comprar Livro se dinheiro > 100
        double dinheiro = 120;
        String compravel = (dinheiro > 100) ? "Consigo comprar o Livro. :)" : "Não consigo comprar o Livro. :(";
        System.out.println(compravel);
    }
}
