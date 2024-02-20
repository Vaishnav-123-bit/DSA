public class bubbleSort {
    void bubleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort bubbleSortObj = new bubbleSort();
        bubbleSortObj.bubleSort(arr, 6);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
