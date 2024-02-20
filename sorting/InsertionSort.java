public class InsertionSort {
    void insertionSort(int arr[], int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap elements if they are in the wrong order
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Original array:");
        printArray(arr);

        InsertionSort insertionSortObj = new InsertionSort();
        insertionSortObj.insertionSort(arr, arr.length);

        System.out.println("Array after Insertion Sort:");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
