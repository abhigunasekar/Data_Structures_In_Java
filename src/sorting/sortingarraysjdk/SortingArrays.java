package sorting.sortingarraysjdk;

// This Class Illustrates the way to sort data based on the methods present in JDK

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Arrays.parallelSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
