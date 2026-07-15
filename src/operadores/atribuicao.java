package operadores;

public class atribuicao {
    public static void main(String[] args) {
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        bonus = bonus + 1800;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);

    }
}
