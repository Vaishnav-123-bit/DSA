#include<iostream>
using namespace std;
void KMtoMile(float n){
    float res=n*(5.0/18.0);
    cout<<res<<endl;
}

void tempConvert(int temp){
    float convert=(temp-32.0)*(5.0/9.0);
    cout<<convert<<endl;
}
int main(){
    KMtoMile(15);
    tempConvert(30);
    return 0;

}