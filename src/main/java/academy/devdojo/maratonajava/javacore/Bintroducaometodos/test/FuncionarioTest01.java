package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jose");
        funcionario.setIdade(43);
        funcionario.setSalarios(new double[]{2000,2333,2030});
        funcionario.imprimir();
        System.out.println(funcionario.getMedia());

    }
}
