// Dipraj

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;

 void reverseInGroups(vector<long long>& arr, int n, int k){
        // code here
        if(k>n)
        reverse(arr.begin(), arr.end());
        else{
        int rest = n/k;
        int finalRest =n- rest*k;
        auto beg = arr.begin();
        for (int i = 0; i < rest; i++)
        {
            reverse(beg, beg+k);
            beg +=k;
        }
        reverse(arr.begin()+n-finalRest,arr.end());
        
        }
    }

int main()
{
    FAST_IO;
    int t;
    cin>>t;
    while (t--)
    {
        int n;
        cin>>n;
        vector< long long> arr;
        int k;
        cin>>k;
        for (int i = 0; i < n; i++)
        {
            long long  x;
            cin>> x;
            arr.push_back(x);
        }
          reverseInGroups(arr, n, k);
           for (int  i = 0; i < n; i++)
           {
            cout<< arr[i]<< " ";
           }
    }
         
           
    
}