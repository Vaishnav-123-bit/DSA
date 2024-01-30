#include<iostream>
using namespace std;

int main() {
    int ar[] = {1, 2, 3, 4, 5};
    int n = sizeof(ar) / sizeof(ar[0]); // Calculate the number of elements in the array

    for(int i = 0; i < n / 2; i++) {
        // Swap elements from the beginning and end of the array
        int temp = ar[i];
        ar[i] = ar[n - 1 - i];
        ar[n - 1 - i] = temp;
    }

    for(int i = 0; i < n; i++) {
        cout << ar[i] << " ";
    }

    return 0;
}
