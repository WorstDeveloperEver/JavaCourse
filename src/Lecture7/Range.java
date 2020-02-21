package Lecture7;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return this.to - this.from;
    }

    public boolean isInside(double number) {
        double epsilon = 1e-10;

        return (number - from > epsilon && to - number > epsilon) || (Math.abs(from - number) <= epsilon || Math.abs(to - number) <= epsilon);
    }
}
