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
    map<pair<string, string>, int> mp;
    int t;
    cin>>t;
    for (int i = 0; i < t; i++)
    {
        string str1, str2;
        cin>> str1>>str2;
        pair<string, string> temp;
        temp.first = str1;
        temp.second = str2;
        mp[temp] = 1;
    }
    int count = 0;
    for (auto it = mp.begin(); it != mp.end(); it++)
    {
        count+=(*it).second;
    }
    cout<<count<<endl;
    // cout<<mp.size()<<endl;
}