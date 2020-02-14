package CourseTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        final int tableSize = 10;

        System.out.printf("%n     ");
        for (int i = 0; i < tableSize; i++) {
            System.out.printf("%4d", i + 1);
        }
        System.out.printf("%n     ");
        for (int i = 0; i < tableSize; i++) {
            System.out.print("----");
        }

        for (int i = 0; i < tableSize; i++) {
            System.out.printf("%n%3d |", i + 1);
            for (int j = 0; j < tableSize; j++) {
                System.out.printf("%4d", (i + 1) * (j + 1));
            }
        }
    }
}