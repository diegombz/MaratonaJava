package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double num : salarios) {
            System.out.print(num + " ");
        }
        imprimirMediaSalario();
    }

    public void imprimirMediaSalario() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media = media + salario;
        }
         media /= salarios.length;
        System.out.println("\nMedia: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia(){
        return media;
    }

}