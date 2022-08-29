// Dipraj
//588A cf

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO                       \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL)
#define yes cout << "YES" \
                 << "\n";
#define no cout << "NO" \
                << "\n";
#define ll long long int;

int main()
{
    FAST_IO;
    int n;
    cin >> n;
    int arr1[n];
    int arr2[n];
    int i = 0;
    int a = n;
    while (n--)
    {
        int x, y;
        cin >> x >> y;
        arr1[i] = x;
        arr2[i] = y;
        i++;
    }
    i = 0;
    int totalSum = 0;
    int localSum = arr2[0] * arr1[0];
    int value = arr2[0];
    for (i = 1; i < a; i++)
    {

        if (value <= arr2[i])
        {
            localSum += (arr1[i]) * value;
        }
        else
        {
            value = arr2[i];
            localSum += (arr1[i]) * value;
        }
    }
    cout << localSum;
}