#include <iostream>
using namespace std;
// void area(int r){
//     float a=3.14*r*r;
//     cout<<a<<endl;
// }

// void fact(int n)
// {
//     float sum = 1;
//     while (n > 1)
//     {
//         sum=sum*n;
//         n--;

//         if(n==1){
//             cout<<sum<<endl;
//         }
//     }
// }



bool allPrimes(int n){
    for(int i=2;i<=n;i++){
        if(n%i==0){
            return false;
        }
        else{
           return true;
        }
    }
}

int main()
{
    // area(4);
    // fact(4);
    if(allPrimes(5)){
        cout<<"is prime"<<endl;
    }else{
        cout<<"unprime";
    }
    return 0;
}
