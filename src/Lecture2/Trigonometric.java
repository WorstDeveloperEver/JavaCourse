package Lecture2;

public class Trigonometric {
    public static void main(String[] args) {
        double angle = 60, rad = Math.toRadians(angle);
        System.out.printf("Sin(60)= %f, Cos(60)= %f, sqr(3)= %d, Pi = %f, abs(-7) = %d",
                           Math.sin(rad), Math.cos(rad), (int) Math.pow(3, 2), Math.PI, Math.abs(-7));
    }
}
