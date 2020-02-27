package Lecture9;

public class ArrayOfStringsInUpperCase {
    public static void main(String[] args) {
        String[] array = {"London ", "is ", "the ", "capital ", "of ", "Great ", "Britain"};

        getUpperCaseString(array);

        for (String value : array) {
            System.out.print(value);
        }
    }

    public static void getUpperCaseString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
