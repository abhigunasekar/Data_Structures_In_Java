package searching;

// !!! Important: Remember data must be sorted !!!

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
//        System.out.println(iterativeBinarySearch(intArray, -22));
//        System.out.println(iterativeBinarySearch(intArray, -15));
//        System.out.println(iterativeBinarySearch(intArray, 1));
//        System.out.println(iterativeBinarySearch(intArray, 7));
//        System.out.println(iterativeBinarySearch(intArray, 20));
//        System.out.println(iterativeBinarySearch(intArray, 35));
//        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(recursiveBinarySearch(intArray, -22));
        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, 7));
        System.out.println(recursiveBinarySearch(intArray, 20));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 55));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int low = 0;
        int high = input.length;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (value == input[mid]) {
                return mid;
            }
            else if (value < input[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Overloaded Method
    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(0, input.length, input, value);
    }

    public static int recursiveBinarySearch(int low, int high, int[] input, int value) {
        if (low >= high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid] == value) {
            return mid;
        }
        // Don't forget to return the result of a recursive call!
        else if (value < input[mid]) {
            return recursiveBinarySearch(low, mid, input, value);
        }
        else {
            return recursiveBinarySearch(mid + 1, high, input, value);
        }
    }
}
