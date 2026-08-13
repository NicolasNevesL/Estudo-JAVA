package metodos.test;

import metodos.dominio.EstudanteM;
import metodos.dominio.ImpresoraEstudantes;

public class EstudanteMTest02 {
    public static void main(String[] args) {
        EstudanteM estudanteM01 = new EstudanteM();
        EstudanteM estudanteM02 = new EstudanteM();

        estudanteM01.nome = "Hinata";
        estudanteM01.idade = 18;
        estudanteM01.sexo = 'F';


        estudanteM02.nome = "Tsunade";
        estudanteM02.idade = 44;
        estudanteM02.sexo = 'F';

        estudanteM01.imprime();
        estudanteM02.imprime();
    }
}
