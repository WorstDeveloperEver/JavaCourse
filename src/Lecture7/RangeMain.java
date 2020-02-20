package Lecture7;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(2, 9.5);

        System.out.println("Length = " + range.length());

        range.setFrom(5);
        range.setTo(15);

        System.out.printf("New range - from %.2f to %.2f%n", range.getFrom(), range.getTo());

        double number = 14.9;

        System.out.printf("Number %.2f is inside? %b", number, range.isInside(number));
    }
}
