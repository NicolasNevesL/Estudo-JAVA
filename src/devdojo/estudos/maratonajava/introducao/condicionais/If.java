package condicionais;

public class If {
    public static void main(String[] args) {
        // Forma 1 de usar o IF
        int idade = 19;
        if (idade >= 18) {
            System.out.println("Autorizado");
        }
        // Forma 2 de usar o IF
        int idade2 = 11;
        boolean isPessoaAutorizada = idade2 >= 18;
        if (isPessoaAutorizada) {
            System.out.println("Autorizado");
        }
        // Uso do !
        if (!isPessoaAutorizada) {
            System.out.println("Não Autorizado");
        }
    }
}
