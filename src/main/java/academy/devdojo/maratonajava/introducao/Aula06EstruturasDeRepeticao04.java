package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro,descubra em quantas vezes ele pode ser parcelado
        // valorParcela >= 1000
        double valorCarro = 20000;
        double valorParcela;
        for (int parcela = 1; parcela < valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + " parcela de R$" + valorParcela);
        }
    }
}
