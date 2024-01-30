#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i <= n; i++)
    {
        int k = 0;
        if (i < n)
        {
            k = i;
        }
        else
        {
            k = n - (i % n) - 2;
        }

        for (int j = 0; j < k; j++)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}
