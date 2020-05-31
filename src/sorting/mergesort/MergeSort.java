package sorting.mergesort;

//Time Complexity: O(nlogn)
//Stable

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // {20, 35, -15, 7, 55, 1, -22}

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return; // Base Case: 1 Element Array
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid); //end index exclusive
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) {
            return; // Adaptive Condition: Checks whether arr is sorted
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while ((i < mid) && (j < end)) { // Keeping the >= sign keeps the algorithm stable
            temp[tempIndex++] = (input[i] >= input[j]) ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
        return;
    }
}

/*
My Working Implementation: Merge Sort
void merge(int arr[], int start, int mid, int r)
	{
		if (arr[mid + 1] == arr[mid]) {
        	return;
        }
      	int[] auxArr = new int[r - start + 1];
      	int k = 0;
      	int i = start;
     	int j = mid + 1;
    	while ((i <= mid) && (j <= r)) {
        	auxArr[k++]  = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        for (i = i; i <= mid; i++) {
        	auxArr[k++] = arr[i];
        }
        for (j = j; j <= r; j++) {
        	auxArr[k++] = arr[j];
        }
        for (int z = 0; z < auxArr.length; z++) {
       		arr[z + start] = auxArr[z];
        }
        return;
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}
 */
