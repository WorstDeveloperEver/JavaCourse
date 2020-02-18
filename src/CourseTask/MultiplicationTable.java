package CourseTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        final int tableSize = 10;

        System.out.printf("%n     ");

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }

        System.out.printf("%n     ");

        for (int i = 0; i < tableSize; i++) {
            System.out.print("----");
        }

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%n%3d |", i);

            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
        }
    }
}