package CourseTask;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42};

        int index = binarySearchRecursion(array, 0, array.length - 1, 42);
        System.out.println("Searching by recursion, element index: " + index);

        index = binarySearch(array, 42);
        System.out.println("Searching without recursion, element index: " + index);
    }

    public static int binarySearchRecursion(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (array[middle] == x) {
            return middle;
        }

        if (x > array[middle]) {
            return binarySearchRecursion(array, middle + 1, right, x);
        } else {
            return binarySearchRecursion(array, left, middle - 1, x);
        }
    }

    public static int binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (array[middle] == x) {
                return middle;
            }

            if (x > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
