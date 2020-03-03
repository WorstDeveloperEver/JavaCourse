package CourseTask;

public class BinarySearch {
    public static void main(String[] args) {

        int[] a = {4, 8, 15, 16, 23, 42};

        int searchIndex = getBinarySearchRecursionIndex(a, 0, a.length - 1, 42);

        System.out.println("Searching by recursion, element index: " + searchIndex);

        searchIndex = getBinarySearchIndex(a, 42);

        System.out.println("Searching without recursion, element index: " + searchIndex);
    }

    public static int getBinarySearchRecursionIndex(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (a[middle] == x) {
            return middle;
        }

        if (x > a[middle]) {
            return getBinarySearchRecursionIndex(a, middle + 1, right, x);
        }

        if (x < a[middle]) {
            return getBinarySearchRecursionIndex(a, left, middle - 1, x);
        }

        return -1;
    }

    public static int getBinarySearchIndex(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (a[middle] == x) {
                return middle;
            }

            if (x > a[middle]) {
                left = middle + 1;
            }

            if (x < a[middle]) {
                right = middle - 1;
            }
        }

        return -1;
    }
}
