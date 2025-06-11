# ♨️☕ Java | Fundamentos

Este repositório contém alguns exemplos e anotações sobre conceitos de Java, abordando:

<details>

<summary>Operadores</summary>

### Operadores

| Operador | Função |
|----------|--------|
| =        | Atribuição |
| +        | Adição |
| -        | Subtração |
| *        | Multiplicação |
| /        | Divisão | 
| %        | Resto De Divisão |
| ++       | Incremento |
| --       | Decremento |
| ==       | Utilizado para verificar se uma variável é igual a outra |
| !=       | Utilizado para verificar se uma variável é diferente da outra |
| >        | Utilizado para verificar se uma variável é maior que outra |
| >=       | Utilizado para verificar se uma variável é maior ou igual a outra |
| <        | Utilizado para verificar se uma variável é menor que outra |
| <=       | Utilizado quando desejamos verificar se uma variável é menor ou igual a outra |
| &&       | Utilizado quando desejamos que as duas expressões sejam verdadeiras |
| `\|\|`   | Utilizado quando precisamos que pelo meno um das expressões seja verdadeira |
</details>

<details>

<summary>Estruturas Condicionais</summary>

### If/else
O if/else é uma estrutura de condição em que uma expressão booleana é analisada. Quando a condição que estiver dentro do if for verdadeira, ela é executada. Já o else é utilizado para definir o que é executado quando a condição analisada pelo if for falsa. Caso o if seja verdadeiro e, consequentemente executado, o else não é executado.
 ```java
 int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
 ```

### Switch/case
A estrutura condicional switch/case vem como alternativa em momentos em que temos que utilizar múltiplos ifs no código. Múltiplos if/else encadeados tendem a tornar o código muito extenso, pouco legível e com baixo índice de manutenção.

O switch/case testa o valor contido em uma variável, realizando uma comparação com cada uma das opções. Cada uma dessas possíveis opções é delimitada pela instrução case.

Podemos ter quantos casos de análise forem necessários e, quando um dos valores corresponder ao da variável, o código do case correspondente será executado. Caso a variável não corresponda a nenhum dos casos testados, o último bloco será executado, chamado de default (padrão).

A análise de cada caso também precisa ter seu final delimitado. Essa delimitação é feita através da palavra break.

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```
</details>

<details>

<summary>Estruturas De Repetição</summary>

### For
O for é uma estrutura de repetição na qual seu ciclo será executado por um tempo ou condição pré-determinados e em uma quantidade de vezes que determinamos.

O for possui a seguinte estrutura:
```java
for (<variável de controle>, <análise da variável de controle>, <incremento da variável de controle>) {
    // Código a ser executado
}
```
Quando utilizamos o for, precisamos de uma variável para auxiliar a controlar a quantidade de repetições a serem executadas. Essa variável é chamada de variável de controle e é declarada no primeiro argumento do for.

O segundo argumento do for é utilizado para definir até quando o for será executado. Geralmente, trata-se de uma condição booleana em cima da variável de controle.

O terceiro argumento indica o quanto a variável de controle será modificada no final de cada execução dentro do for.

Veja o exemplo abaixo:
```java
public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(“A variável i agora vale “ + i);
        }
    }
```
### For-each
O for-each é uma forma mais simples de percorrer arrays ou coleções em Java.
Ele é usado quando você não precisa do índice, apenas dos valores.

Exemplo com array simples:
```java
public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
```
Saída:
```
Maçã  
Banana  
Laranja
```
### While 
O while também é uma estrutura de repetição, assim como o for. A diferença entre ambas é que, enquanto usamos o for quando geralmente conhecemos a quantidade de vezes que o trecho de código deverá ser repetido, nós utilizamos o while quando não sabemos exatamente quantas vezes o código será repetido.

O while possui a seguinte estrutura:
```java
while (<condição>) {
    // Trecho de código a ser repetido
}
```
Perceba que a condição para interrupção da repetição do trecho dentro do while se dá através de uma condição booleana.

Exemplo:
```java
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = -1;
        while (numero != 10) { 
// enquanto a variável não for 10, o trecho de código será repetido
            System.out.println(“Digite um número: “);
            numero = in.nextInt();
            if (numero == 10) {
                System.out.println(“Você acertou!“);
            } else {
                System.out.println(“Você errou :(“);
            }
        }
    }
```
### Do/While
O do/while é uma estrutura de repetição parecida com o while, mas com uma diferença importante:

No do/while, o bloco de código é executado pelo menos uma vez, mesmo que a condição seja falsa logo no início.

Estrutura básica: 
```java
do {
    // Bloco de código que será executado
} while (condição);
```
Exemplo: 
```java
int numero = 0;

do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero < 3);
```
</details>

<details>

<summary>Arrays</summary>

Um array em Java é uma estrutura de dados que armazena uma coleção de valores do mesmo tipo (por exemplo, só int, ou só String, etc.).

O tamanho do array é fixo (definido quando criado).

Cada valor é acessado por um índice, que começa em 0.

Declaração e uso de um array:
```java
// Criando um array de 3 números inteiros
int[] numeros = new int[3];

// Atribuindo valores
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;

// Acessando e mostrando os valores
System.out.println(numeros[0]); // Saída: 10
System.out.println(numeros[1]); // Saída: 20
System.out.println(numeros[2]); // Saída: 30
```
Exemplo: 
```java
public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }
```
Saída:
```
Maçã  
Banana  
Laranja
```
</details>

<details>

<summary>Arrays Multidimensionais</summary>

Arrays multidimensionais são arrays dentro de arrays.

O mais comum é o array 2D, que pode ser visto como uma matriz (linhas e colunas).

Cada elemento é acessado por dois índices: [linha][coluna].

Declaração e uso de array 2D:
```java
int[][] matriz = new int[2][3];  // 2 linhas, 3 colunas

// Atribuindo valores
matriz[0][0] = 1;
matriz[0][1] = 2;
matriz[0][2] = 3;
matriz[1][0] = 4;
matriz[1][1] = 5;
matriz[1][2] = 6;

// Acessando valor na linha 1, coluna 2
System.out.println(matriz[1][2]);  // Saída: 6
```
Exemplo: 
```java
public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matriz.length; i++) {           // percorre linhas
            for (int j = 0; j < matriz[i].length; j++) {    // percorre colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
```
Saída:
```
1 2 3 
4 5 6 
```
- matriz.length é o número de linhas.

- matriz[i].length é o número de colunas da linha i.

</details>

## 🔍 Referências

[Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
    







