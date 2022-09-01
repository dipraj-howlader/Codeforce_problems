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
    int t,n;
    cin>>t;
    map<pair<int,int> , string> mp;
    while (t--)
    {
        int x,y;
        string str;
        cin>>x>>y>>str;
        pair<int, int> pt;
        pt.first = x;
        pt.second = y;
        mp[pt] = str;
    }
    cin>>n;
    for (int  i = 0; i < n; i++)
    {
        int x , y;
        cin>>x>>y;
        pair<int, int> pt;
        pt.first = x;
        pt.second = y;
        cout<<mp[pt]<<endl;
    }
    
}