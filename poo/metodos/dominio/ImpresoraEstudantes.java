package metodos.dominio;

public class ImpresoraEstudantes {
    public void imprime(EstudanteM estudanteM){
        System.out.println("----------------");

        System.out.println(estudanteM.nome);
        System.out.println(estudanteM.idade);
        System.out.println(estudanteM.sexo);
    }
}
