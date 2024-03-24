public class selectionSort {
    // void selection_Sort(int arr[], int n) {
    //     for (int i = 0; i < n - 1; i++) {
    //         int minElement = i;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] < arr[minElement]) {
    //                 minElement = j;
    //             }
    //         }
    //         int temp = arr[minElement];
    //         arr[minElement] = arr[i];
    //         arr[i] = temp;
    //     }
    // }
    void selection_Sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minElement=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minElement]){
                    minElement=j;
                }
            }
            int temp=arr[minElement];
            arr[minElement]=arr[i];
            arr[i]=temp;
        }
      
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort selectionSortObj = new selectionSort();
        selectionSortObj.selection_Sort(arr, 6);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
