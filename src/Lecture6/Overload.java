package Lecture6;

public class Overload {
    public static void main(String[] args) {
        System.out.printf("Byte need: %d byte %n", getTypeSize((byte) 1));

        System.out.printf("Short need: %d byte %n", getTypeSize((short) 1));

        System.out.printf("Integer need: %d byte %n", getTypeSize(1));

        System.out.printf("Long need: %d byte %n", getTypeSize(1L));

        System.out.printf("Float need: %d byte %n", getTypeSize(1.0F));

        System.out.printf("Double need: %d byte %n", getTypeSize(1.0));
    }

    public static int getTypeSize(byte x) {
        return 1;
    }

    public static int getTypeSize(short x) {
        return 2;
    }

    public static int getTypeSize(int x) {
        return 4;
    }

    public static int getTypeSize(long x) {
        return 8;
    }

    public static int getTypeSize(float x) {
        return 4;
    }

    public static int getTypeSize(double x) {
        return 8;
    }
}
