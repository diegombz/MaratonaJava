package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }

//        if (!isAutorizadoComprarBebida){
//            System.out.println("Nao autorizado a comprar bebida alcolica");
//        }
    }
}
