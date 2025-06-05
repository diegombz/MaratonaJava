package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salarios > 5000
        double salario = 2000;
        //(condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda nao tenho condicoes, mas vou ter!";
        System.out.println(resultado);
    }
}
