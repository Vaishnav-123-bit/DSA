
 class MergeSort {

    void conquere(int arr[], int si, int mid, int ei) {
        int MergeArr[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                MergeArr[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                MergeArr[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            MergeArr[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= ei) {
            MergeArr[x] = arr[idx2];
            x++;
            idx2++;
        }

        for(int i=0,j=si;i<MergeArr.length;i++,j++){
            arr[j]=MergeArr[i];
        }
    }

    void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquere(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[]={6,4,3,8,9};
        int n=arr.length;
        MergeSort mergeSort = new MergeSort();
        mergeSort.divide(arr, 0, n - 1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}