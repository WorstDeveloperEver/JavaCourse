package Lecture9;

public class ArrayStringsInUpperCase {
    public static void main(String[] args) {
        String[] array = {"London ", "is ", "the ", "capital ", "of ", "Great ", "Britain"};

        convertStringsToUpperCase(array);

        for (String value : array) {
            System.out.print(value);
        }
    }

    public static void convertStringsToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
