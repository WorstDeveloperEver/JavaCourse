package Lecture9;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        final int size = 10;
        int[][] multiplicationTable = getMultiplicationTable(size);

        for (int[] ints : multiplicationTable) {
            for (int i = 0; i < multiplicationTable.length; i++) {
                System.out.printf("%4d", ints[i]);
            }

            System.out.println();
        }
    }

    public static int[][] getMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (j + 1) * (i + 1);
            }
        }

        return multiplicationTable;
    }
}
