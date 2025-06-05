package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int[] array = {1, 3, 6};
        int[][] arrayInt = new int[3][];

        //Declaração de Arrays Multidimensionais
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{4, 6, 9, 10};
        arrayInt[2] = array;

        int[][] arrayInt2 = {{0, 0}, {1, 1, 1}, {1, 2, 3, 4, 5, 6}};

        for (int[] baseArray : arrayInt) {
            System.out.println("\n-------");
            for (int num : baseArray) {
                System.out.print(num + "  ");
            }
        }

        System.out.println("\n=================================");

        for (int[] baseArray2 : arrayInt2) {
            System.out.println("\n-------");
            for (int num : baseArray2) {
                System.out.print(num + "  ");
            }
        }
    }
}
