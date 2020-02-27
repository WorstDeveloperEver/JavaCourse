package Lecture9;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        final int size = 10;
        int[][] multiplicationTable = getMultiplicationTable(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }

            System.out.println();
        }
    }

    public static int[][] getMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (j + 1) * (i + 1);
            }
        }

        return multiplicationTable;
    }
}
