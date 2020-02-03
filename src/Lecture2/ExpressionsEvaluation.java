package Lecture2;

public class ExpressionsEvaluation {
    public static void main(String[] args) {
        double x = 3 - (2);
        double y = (2 * x) / (33 - x);
        double z = -x / (2 * y);

        System.out.printf("x = %.0f; y = %.4f; z = %.0f", x, y, z);
    }
}
