package CourseTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        final int tableSize = 10;
        int printedNumber;

        for (int i = -1; i <= tableSize; i++) {
            for (int j = -1; j <= tableSize; j++) {
                printedNumber = Math.abs(i * j);

                if (j == 0) {
                    System.out.print(" | ");
                } else if (i == 0) {
                    System.out.print("----");
                }

                if (i != 0 && j != 0) {
                    System.out.printf("%4d", printedNumber);
                }

                if (j == tableSize) {
                    System.out.println();
                }
            }
        }
    }
}
