// Dipraj

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
    map<string, int> s;
    while (t--)
    {
        string str;
        cin>>str;
        if(s.count(str)==0){
            cout<<"OK"<<endl;
            s[str] = 1;
        }else{
            cout<<str<<s[str]<<endl;
            s[str]+=1;
        }
    }
}