#include<iostream>
using namespace std;
int countSetBits(int n){
    int count=0;
    while(n){
        
        count+=n&1;
        n>>=1;
    }

    return count;
}
int main(){
    int res=countSetBits(2);
    cout<<res<<endl;
    return 0;

}