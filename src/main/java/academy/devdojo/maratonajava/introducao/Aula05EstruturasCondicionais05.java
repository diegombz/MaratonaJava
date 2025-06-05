package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana,considerando o 1 como domingo
        // char, int, byte,short, enum, String
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        char sexo = 'A';
        switch (sexo) {
            case 'M':
                System.out.println("Seu sexo é Masculino");
                break;
            case 'F':
                System.out.println("Seu sexo é Feminino");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
