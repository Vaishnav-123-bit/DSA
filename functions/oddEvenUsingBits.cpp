#include<iostream>
using namespace std;
bool isEven(int n){
    return (n&1)==0;
}
int main(){
    int res=isEven(2);
    if(res==true){
        cout<<"even"<<endl;
    }
    else{
        cout<<"Odd";
    }
    return 0;
}