// Dipraj
//782A
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
    t=t*2;
    int count = 0;
    int max = 0;
    map<ll, ll> mp;
    for(int i=0;i<t;i++){
        int x;
        cin>>x;
        if(mp[x]==0){
            mp[x]++;
            count++;
            if(max<count)
            max = count;
        }
        else{
            mp[x]--;
            count--;
        }
    }
    cout<<max<<endl;
}