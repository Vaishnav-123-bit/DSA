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

// bool allPrimes(int n){
//     if(n<=1){
//         return false;
//     }
//     for(int i=2;i<=n/2;i++){
//         if(n%i==0){
//             return false;
//         }
//     }
//     return true;
// }
bool isPrime(int n)
{
    if (n <= 1)
    {
        return false; // 0 and 1 are not prime numbers
    }

    for (int i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            return false; // If n is divisible by i, then it's not a prime number
        }
    }

    return true; // If no divisors found, n is a prime number
}

int main()
{
    if (isPrime(8))
    {
        cout << "is prime" << endl;
    }
    else
    {
        cout << "not prime" << endl;
    }
    return 0;
};
