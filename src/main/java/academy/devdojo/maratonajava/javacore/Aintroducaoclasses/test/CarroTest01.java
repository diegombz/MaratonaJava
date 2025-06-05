package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Vectra GT";
        carro01.modelo = "4 Portas";
        carro01.ano = 2001;

        carro02.nome = "Fusca";
        carro02.modelo = "2 Portas";
        carro02.ano = 1968;

        System.out.println("Carro: "
                + carro01.nome
                + "\nModelo: "
                + carro01.modelo
                + "\nAno: "
                + carro01.ano);

        System.out.println("--------------------------");

        System.out.println("Carro: "
                + carro02.nome
                + "\nModelo: "
                + carro02.modelo
                + "\nAno: "
                + carro02.ano);
    }
}
