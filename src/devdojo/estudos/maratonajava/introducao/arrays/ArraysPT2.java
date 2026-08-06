package devdojo.estudos.maratonajava.introducao.arrays;

public class ArraysPT2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Sasuke";
        nomes[1] = "Naruto";
        nomes[2] = "Madara";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
