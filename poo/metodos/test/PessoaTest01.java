package metodos.test;

import metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jason");
        pessoa.setIdade(30);

        // pessoa.imprime(); também poderia ser usado

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
