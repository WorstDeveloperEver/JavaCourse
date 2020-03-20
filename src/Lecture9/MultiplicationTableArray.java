package Lecture9;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        final int rowsAmount = 12;
        final int columnsAmount = 10;
        int[][] multiplicationTable = getMultiplicationTable(rowsAmount, columnsAmount);

        for (int[] row : multiplicationTable) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }

            System.out.println();
        }
    }

    public static int[][] getMultiplicationTable(int rowsAmount, int columnsAmount) {
        int[][] multiplicationTable = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                multiplicationTable[i][j] = (j + 1) * (i + 1);
            }
        }

        return multiplicationTable;
    }
}
