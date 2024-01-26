#include<iostream>
using namespace std;
int main(){
    float a,b,ans;
    int choice;
    cin>>a>>b;
    cout<<"enter your ops";
    cin>>choice;
    switch (choice){
        case 1:
            ans=a-b;
            break;

        case 2:
            ans=a+b;
            break;

        default:
            cout<<"wrong";
            break;

        return 0;
    }
    cout<<ans<<endl;
    return 0;

}