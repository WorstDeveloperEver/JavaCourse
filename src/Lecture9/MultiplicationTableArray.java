package Lecture9;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        final int row = 12;
        final int column = 10;
        int[][] multiplicationTable = getMultiplicationTable(row, column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] getMultiplicationTable(int row, int column) {
        int[][] multiplicationTable = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                multiplicationTable[i][j] = (j + 1) * (i + 1);
            }
        }

        return multiplicationTable;
    }
}
