package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salario = 25000;
        double taxa1 = salario * 9.70 / 100;
        double taxa2 = salario * 37.35 / 100;
        double taxa3 = salario * 49.50 / 100;
        double valorImposto;

        if (salario <= 34712) {
            valorImposto = taxa1;
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = taxa2;
        } else {
            valorImposto = taxa3;
        }
        System.out.println("Seu salarios é de R$"
                + salario
                + " e sera descontado R$"
                + valorImposto);
    }
}
