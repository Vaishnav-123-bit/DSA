#include<iostream>
using namespace std;
 int main(){
    int arr[]={1,2,3,4,5};
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<sizeof(arr)/sizeof(arr[0]);i++){
        if(arr[i]>max){
            max=arr[i];
            
        }else if(arr[i]<min){
            min=arr[i];
        }
    }
    cout<<max<<endl<<min;
    return 0;
 }