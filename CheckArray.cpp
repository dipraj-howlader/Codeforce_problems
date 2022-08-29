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
    multiset<int> m1;
    multiset<int> m2;
    for (int i = 0; i < t; i++)
    {
        int x;
        cin>>x;
        m1.insert(x);
    }

    for (int i = 0; i < t; i++)
    {
        int x;
        cin>>x;
        m2.insert(x);
    }
    bool is_it_ok = true;
    for (auto it1 = m1.begin(), it2 = m2.begin(); it1!=m1.end(); it1++,it2++)
    {
        if(*it1!=*it2)
        is_it_ok = false;
    }
    if(is_it_ok) cout<<"1";
    else cout<<"0";
    
}