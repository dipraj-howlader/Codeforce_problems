// Dipraj

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int

int main()
{
    FAST_IO;
    ll n,t;
    cin>>n>>t;
    vector<ll> s1(n);
   vector<ll> sum(n+1);
    for (ll i = 0; i < n; i++)
    {
        ll in;
        cin>>in;
        s1[i] = in;
    }
    sort(s1.begin(), s1.end());

    for(int i=0;i<n;i++){
         ll first = s1[i];
        sum[i+1] = sum[i]+s1[i];
    }
    for (int i = 0; i < t; i++)
    {
        ll x,y;
        cin>>x>>y;
        ll dif = sum[n-x+y] - sum[n-x];
        cout<<dif<<endl;
    }
    
}