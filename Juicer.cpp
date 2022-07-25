// Dipraj
//Juiver 709A
#include <bits/stdc++.h>
using namespace std;
#define FAST_IO                       \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL)
#define yes cout << "YES" \
                 << "\n";
#define no cout << "NO" \
                << "\n";

int main()
{
    FAST_IO;
    int n;
    long long int b, d;
    cin >> n >> b >> d;
    int s = n;
    long long int sum = 0;
    int count=0;
    while (s--)
    {
        long long int t;
        cin>>t;
        if(t<=b)
       {
        sum =sum + t;
       }
       if(sum>d){
        sum = 0;
        count++;
       }
    }
cout<<count;
}