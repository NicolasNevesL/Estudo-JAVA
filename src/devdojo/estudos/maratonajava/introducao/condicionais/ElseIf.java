package condicionais;

public class ElseIf {
    public static void main(String[] args) {
        // Uso de If e Else
        int age = 15;
        boolean isAutorizadoBebida = age >= 18;
        if (isAutorizadoBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não Autorizado");
        }

        // Uso de ElseIF
        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
