// Dipraj
// AtCoder arc087_a problem
#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int

int main()
{
    FAST_IO;
    int t;
    cin>>t;
    map<int,int> mp;
    for (int i = 0; i < t; i++)
    {
        int x;
        cin>>x;
        mp[x]++;
    }
    int count = 0;
    for (auto i = mp.begin(); i != mp.end(); i++)
    {
        if((*i).first >(*i).second){
            count+=(*i).second;
        }
        else if((*i).first <(*i).second){
            count += ((*i).second-(*i).first);
        }
    }
    cout<<count<<endl;
    
}