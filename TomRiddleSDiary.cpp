// Dipraj
//885A Problem
#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;

int main()
{
    FAST_IO;
    int t;
    cin>>t;
    map<string, int> st;
    while (t--)
    {
        string str;
        cin>> str;
        if(st[str]==0){
        no
        st[str]++;
        }
        else{
            yes
        }
    }
    
}