package academy.devdojo.maratonajava.introducao;
/*
Texto do exercício:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salarios>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){

        String nome = "Maria";
        String endereco = "Rua das Laranjeiras 12";
        double salario = 1890.23;
        String dataRecebimentoSalario = "23/02/2026";
        String relatorio = "Eu "
                + nome
                + ", morando no endereço "
                + endereco
                + ", confirmo que recebi o salarios de "
                + salario + ", na data "
                + dataRecebimentoSalario
                + ".";
        System.out.println(relatorio);

       // System.out.println("Eu " + nome + ", morando no endereço " + endereco
       // + ", confirmo que recebi o salarios de " + salarios + ", na data " + dataRecebimentoSalario + ".");
    }

}
