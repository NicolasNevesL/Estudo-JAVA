package classe.test;

import classe.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Gilberto";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome+" Idade: "+professor.idade+" Sexo: "+ professor.sexo);

    }
}
