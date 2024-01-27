#include<iostream>
using namespace std;
void binary(int n){
    if(n==0){
        cout<<"Binary - 0000";

    }
    cout<<sizeof(n)<<endl;
    int bits=sizeof(n)*8;
    cout<<bits<<endl;
    for(int i=bits-1;i>=0;--i){
        
        int bit=(n>>i)&1;
        cout<<bit;
    }
    cout<<endl;
}
int main(){
    binary(8);
    return 0;
}